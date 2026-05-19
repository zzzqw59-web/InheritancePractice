package exam_interface;

public class TelevisionTest {
    static void main(String[] args) {
        Television tv = new Television();
        tv.turnOn();
        tv.setVolume(20);
        System.out.println(tv.toString());
        tv.setMute(true);
        tv.turnOff();
        RemoteControl.changeBattery();
        System.out.println();

        // Radio 클래스의 인스턴스 생성
        Radio radio = new Radio();
        radio.turnOn();
        radio.setVolume(50);
        System.out.println(radio.toString());
        radio.printChannel(20);
        radio.turnOff();
        System.out.println();

        // SmartTelevision 클래스의 인스턴스 생성
        SmartTelevision smartTelevision = new SmartTelevision();
        smartTelevision.turnOn();
        smartTelevision.search("http://www.naver.com");
        smartTelevision.setVolume(20);
        System.out.println(smartTelevision.toString());
        smartTelevision.turnOff();

    }
}
