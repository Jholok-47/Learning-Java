package ClassObject;

public class Series {
    private String title;
    private int seasons;
    private String genre;
    private double rating;
    private String language;

    // Constructor
    public Series(String title, int seasons, String genre, double rating, String language) {
        this.title = title;
        this.seasons = seasons;
        this.genre = genre;
        this.rating = rating;
        this.language = language;
    }

    // Method to display series details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Seasons: " + seasons);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Language: " + language);
        if(this.getClass() == Series.class) {
            System.out.println();
        }
    }
}
