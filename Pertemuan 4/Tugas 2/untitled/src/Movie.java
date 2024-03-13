public class Movie {
    String movieTitle;
    int availableSeat;
    String genre;
    int duration;

    Movie(String movieTitle, String genre, int duration, int availableSeat){
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.duration = duration;
        this.availableSeat = availableSeat;
    }
}
