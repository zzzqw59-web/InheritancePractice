package exam_class_relation;

public class AlramClock {
    private Time currentTime;
    private Time alarmTime;

    AlramClock() {
        alarmTime = new Time(5, 30, 0);
        currentTime = new Time(15, 0, 0);
    }

    AlramClock(Time a, Time c) {
        alarmTime = a;
        currentTime = c;
    }

    public String toString() {
        return "AlramClock [alram: " + alarmTime.toString() + ", current: " + currentTime.toString() + "]";
    }
}
