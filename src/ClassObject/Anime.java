package ClassObject;

public class Anime extends Series {
    private String studio;
    private String openingTheme;

    // Constructor
    public Anime(String title, int seasons, String genre, double rating, String language,
                 String studio, String openingTheme) {
        super(title, seasons, genre, rating, language);
        this.studio = studio;
        this.openingTheme = openingTheme;
    }

    // Method to display anime details
    //@Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Studio: " + studio);
        System.out.println("Opening Theme: " + openingTheme);
        System.out.println();
    }

    public static void main(String[] args) {
        Anime AOT = new Anime("Attack on Titan", 4, "Action", 9.0, "Japanese",
                                "Wit Studio", "Guren no Yumiya");
        Series DN = new Anime("Death Note", 1, "Thriller", 8.7, "Japanese",
                                "Madhouse", "The World");
        Series BB = new Series("Breaking Bad", 5, "Crime", 9.5, "English");

        AOT.displayInfo();
        BB.displayInfo();
        DN.displayInfo();
    }
}
