package hello.clone.member;

public class Member {
    //회원 고유식별
    private Long memberId;
    //회원이름
    private String memberName;
    //회원등급 (이거 빼먹음)
    private Grade grade;

    public Member(Long memberId, String memberName, Grade grade) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.grade = grade;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
