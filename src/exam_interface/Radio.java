package exam_interface;

public class Radio implements RemoteControl {
    private int volume;
    private double channel;


    @Override
    public void turnOn() {
        System.out.println("라디오의 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오의 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    public String toString() {
        return "현재 라디오의 볼륨: " + volume;
    }

    public void printChannel(double channel) {
        System.out.println("현재 라디오의 채널: " + channel);
    }
}
