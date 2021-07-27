package hello.clone.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    //HashMap으로 저장소 만들기
    private static Map<Long, Member> store = new HashMap<>();

    //회원 정보 저장
    @Override
    public void save(Member member) {
        store.put(member.getMemberId(), member);
    }

    //회원 찾기
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
