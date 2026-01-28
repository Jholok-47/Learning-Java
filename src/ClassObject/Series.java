// This is the base class representing a TV series with various attributes and a method to display it's details.

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
        if(this.getClass() == Series.class) {           //This is how to check if the object is of the base class type
            System.out.println();                       //This is the way to avoid extra line break when called from subclass
        }
    }
}
