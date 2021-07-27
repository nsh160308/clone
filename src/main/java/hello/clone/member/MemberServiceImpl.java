package hello.clone.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    //회원 가입 구현
    @Override
    public void join(Member member) {
        //저장소를 가져와야됨
        memberRepository.save(member);
    }

    //회원 조회 구현
    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
