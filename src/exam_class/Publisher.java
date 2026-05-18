package exam_class;

public class Publisher {
    private String publisherName;
    private String publisherNationality;

    public Publisher(String publisherName, String publisherNationality) {
        this.publisherName = publisherName;
        this.publisherNationality = publisherNationality;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherNationality() {
        return publisherNationality;
    }

    public void setPublisherNationality(String publisherNationality) {
        this.publisherNationality = publisherNationality;
    }

    public String toString() {
        return publisherName + "(" + publisherNationality + ")";
    }
}
