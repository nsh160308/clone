package hello.clone.member;

public interface MemberRepository {

    //회원 정보를 저장
    void save(Member member);
    //회원 id찾기
    Member findById(Long memberId);
}
