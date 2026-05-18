package exam_class_relation;

public class AlramClockTest {
    static void main(String[] args) {
        AlramClock c1 = new AlramClock();
        System.out.println(c1.toString());

        Time alarm = new Time(6, 0, 0);
        Time current = new Time(12, 56, 34);

        AlramClock c2 = new AlramClock(alarm, current);
        System.out.println(c2.toString());

    }
}