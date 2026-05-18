package exam_class;

public class BookMain {
    static void main(String[] args) {
        System.out.println("책정보는 다음과 같다.");

        Author author = new Author("홍길동", 42, "Korea");
        Publisher publisher = new Publisher("Infinity", "Korea");

        Book book = new Book("Do! it! 자바", 700, author, publisher);

        System.out.println(book.toString());
        System.out.print(author.toString());
        System.out.println(publisher.toString());
    }
}
