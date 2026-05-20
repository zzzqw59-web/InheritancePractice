package exam_polymorphism;

public class ClassTest {
    static void main(String[] args) {
        A z = new AA(); // AA 객체를 생성하여 A 타입 참조변수에 대입. 업캐스팅
        System.out.println(z.a); // 참조변수 타입인 A클래스에 필드 a에 대입
        z.b(); // 메서드 오버라이딩이므로 실체 객체 타입인 AA 클래스의 b()가 실행
        System.out.println();

//         z.c(); 컴파일 오류: A 타입 참조변수로 AA 클래스에만 선언된 c()가 호출할 수 없다.

        ((AA)z).c(); // AA타입으로 다운캐스팅하여 c() 호출
        System.out.println(((AA)z).a); // 다운캐스팅 후에는 AA클래스의 필드 a에 접근

        AA a1 = (AA) z; // 다운캐스팅한 객체를 AA타입 참조변수에 저장
        // AA 타입 참조변수이므로 AA 클래스의 필드와 메서드에 접근
        System.out.println(a1.a);
        a1.c();
        System.out.println();

        z = new BB();
        System.out.println(z.a);
        z.b();
        System.out.println();
        // z.d() 컴파일 오류

        ((BB)z).d();
        System.out.println(((BB)z).a);

        BB b1 = (BB)z; // 다운캐스팅
        b1.d();
        System.out.println(b1.a);


    }
}
