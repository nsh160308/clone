package hello.clone.order;

import hello.clone.member.Grade;
import hello.clone.member.Member;
import hello.clone.member.MemberService;
import hello.clone.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "노승환", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "냉장고", 10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
