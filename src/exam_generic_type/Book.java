package exam_generic_type;

public class Book {
    private String title;
    private String writer;

    public Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Book [title = " + title + ", writer = " + writer + "]";
    }


}
