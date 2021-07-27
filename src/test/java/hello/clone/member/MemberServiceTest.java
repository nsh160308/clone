package hello.clone.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    //서비스 테스트 하는 거니까 서비스 가져옴
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given - 멤버 정보를 생성자로 초기화
        Member member = new Member(1L, "노승환", Grade.VIP);

        //when - 멤버 정보를 가지고 회원 가입과 회원 조회
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then - join으로 가입하고 findMember로 회원을 조회하고 이 둘이 같다면 테스트 통과
        Assertions.assertThat(member).isEqualTo(findMember);
        
    }
}
