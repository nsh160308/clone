package hello.clone.order;

import hello.clone.discount.DiscountPolicy;
import hello.clone.discount.FixDiscountPolicy;
import hello.clone.member.Member;
import hello.clone.member.MemberRepository;
import hello.clone.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    //회원 찾기
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    //고정 할인 정책
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();


    //주문 생성 (회원을 찾고 그 회원의 등급을 조사해서 할인정책까지)
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        //회원조회
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
