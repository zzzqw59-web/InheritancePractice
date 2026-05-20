package exam_interface.example;

public class Box implements Comparable2{
    private double volume;

    public Box(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public int compareTo(Object obj) {
        Box other = (Box) obj; // (하위클래스) 상위클래스의 참조변수 -> 다운캐스팅

        if (this.volume > other.volume) {
            return 1;
        } else if (this.volume == other.volume) {
            return 0;
        } else {
            return -1;
        }
    }
}
