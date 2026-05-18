package exam_class;

public class Author {
    private String authorName;
    private int authorAge;
    private String authorNationality;

    public Author(String authorName, int authorAge, String authorNationality) {
        this.authorName = authorName;
        this.authorAge = authorAge;
        this.authorNationality = authorNationality;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(int authorAge) {
        this.authorAge = authorAge;
    }

    public String getAuthorNationality() {
        return authorNationality;
    }

    public void setAuthorNationality(String authorNationality) {
        this.authorNationality = authorNationality;
    }

    public String toString() {
        return authorName + "(" + authorAge + ", " + authorNationality + ") / ";
    }
}
