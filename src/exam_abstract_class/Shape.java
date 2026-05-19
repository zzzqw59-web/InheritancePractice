package exam_abstract_class;

// 추상클래스
public abstract class Shape {
    int x;
    int y;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 추상 메서드(메서드의 선언부분만 존재하고 정의부분을 가지고 있지 않는 메서드
    public abstract void draw();
}
