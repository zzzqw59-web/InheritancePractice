package exam_class;

public class Book {
    private String bookName;
    private int pages;
    private Author author;
    private Publisher publisher;

    public Book(String bookName, int pages, Author author, Publisher publisher) {
        this.bookName = bookName;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String toString() {
        return bookName + " (총페이지수: " + pages + ")\n"
                + author.toString() + publisher.toString();
    }
}
