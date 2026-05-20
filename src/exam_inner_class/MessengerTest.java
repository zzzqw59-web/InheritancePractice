package exam_inner_class;

public class MessengerTest {
    static void main(String[] args) {
        // 익명 클래스
        Messenger messenger = new Messenger() {
            @Override
            public String getMessage() {
                return "힘들지만 오늘도 힘내...";
            }

            @Override
            public void setMessage(String msg) {
                System.out.println("설정된 메세지 내용: " + msg);
            }
        };

        System.out.println(messenger.getMessage());
        messenger.setMessage("오늘도 파이팅~~");
    }
}
