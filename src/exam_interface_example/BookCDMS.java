package exam_interface_example;

import java.util.Arrays;

public class BookCDMS {
    static void main(String[] args) {
        SeperateVolume seperateVolume = new SeperateVolume(863774, "엄마를 부탁해", "신경숙", "홍길동", "2026-05-19", "대출중");
        AppCDInfo appCDInfo = new AppCDInfo("CD002", "자바 학습 프로그램", "김철수", "2026-05-19", "대출중");
        MusicCDInfo musicCDInfo = new MusicCDInfo("006325", "동행", "김동률", new String[]{"고백", "청춘", "내 사람"});

        System.out.println("=== 도서대출 ===");
        seperateVolume.checkOut("홍길동", "2026-05-19");
        System.out.println();

        System.out.println("=== 앱 CD 대출 ===");
        appCDInfo.checkOut("김철수", "2026-05-19");
        System.out.println();

        System.out.println("=== 음악 CD 정보 ===");
        System.out.println(musicCDInfo.getArtist() + " " + musicCDInfo.getTitle() + "[ " + Arrays.toString(musicCDInfo.getSongTitle()) + "] 음반");
        System.out.println();

        System.out.println("=== 반납처리 ===");
        seperateVolume.checkIn();

    }
}
