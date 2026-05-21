package exam_collection_list;

public class Movie {
    private String title;
    private String rating;
    private String director;
    private int releaseYear;

    public Movie() {
    }

    public Movie(String title, String rating, String director, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return String.format("[영화제목: %s, 감독: %s, 개봉연도: %d, 평점: %s]", title, director, releaseYear, rating);
    }
}
