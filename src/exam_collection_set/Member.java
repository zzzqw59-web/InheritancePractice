package exam_collection_set;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Member 클래스의 동일 객체는 age 필드의 값이 같으면 동일객체다.
    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.age == member.age) {
                return true;
            }
        } return false;
    }

    @Override
    public String toString() {
        return String.format("member - (name: %s, age: %d)", name, age);
    }

}
