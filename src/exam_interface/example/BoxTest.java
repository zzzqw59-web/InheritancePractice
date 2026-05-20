package exam_interface.example;

public class BoxTest {
    static void main(String[] args) {
        Box box1 = new Box(100.4);
        Box box2 = new Box(85.0);

        // compareTo 메서드에 비교할 대상을 명시하고 비교
        if (box1.compareTo(box2) > 0) {
            System.out.println("첫번째 박스의 부피가 두번째 박스의 부피보다 큽니다.");
        } else if (box1.compareTo(box2) == 0) {
            System.out.println("첫번째 박스의 부피와 두번째 박스의 부피가 동일합니다.");
        } else {
            System.out.println("첫번째 박스의 부피가 두번째 박스의 부피보다 작습니다.");
        }
    }
}
