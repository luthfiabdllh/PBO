public class Main {
    public static void main(String[] args) {
        MovieApp app = new MovieApp();

//        Menambah film
        Movie setanAlas = new Movie("Setan Alas","Horor",84,45);
        Movie agakLaen = new Movie("Agak Laen","Comedy",119,45);
        Movie tengkorak = new Movie("Tenkorak", "Horor", 114, 45);
        Movie kilometer1000 = new Movie("1000 Kilometer", "Adventure", 90, 45);
        app.addMovie(setanAlas);
        app.addMovie(agakLaen);
        app.addMovie(tengkorak);
        app.addMovie(kilometer1000);
//        Mencetak Daftar Film
        app.displayMovie();
//        Mencari Film
        app.searchMovie("setanAlas");
        app.searchMovie("tenkorak");
        app.searchMovie("Ghibli");
//        Melakukan Booking
        app.bookMovie(agakLaen,12);
        app.bookMovie(setanAlas,34);
//        Mencetak Daftar Film Tersisa
        app.displayMovie();
//        Mencari Booking id
        app.searchBooking(1);
        app.searchBooking(2);
        app.searchBooking(3);
    }
}