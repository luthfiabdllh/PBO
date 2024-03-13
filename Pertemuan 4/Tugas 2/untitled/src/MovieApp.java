import java.util.ArrayList;

public class MovieApp {
    ArrayList<Movie> daftarFilm = new ArrayList<Movie>();
    ArrayList<Booking> daftarBooking = new ArrayList<Booking>();

    MovieApp(){

    }
    void addMovie(Movie film){
        daftarFilm.add(film);
    }
    void displayMovie(){
        System.out.println("Daftar Film");
        for(Movie e:daftarFilm){
            System.out.printf("%d mins ~ %s - %s (%d Seats)\n",e.duration,e.movieTitle,e.genre,e.availableSeat);
        }
    }
    void searchMovie(String title){
        for(Movie e:daftarFilm){
            if(e.movieTitle==title){
                System.out.printf("Film %s tersedia %d kursi\n",e.movieTitle,e.availableSeat);
                return;
            }
        }
        System.out.printf("Film %s tidak tersedia\n",title);
    }
    void bookMovie(Movie film,int seats){
        for(Movie e:daftarFilm){
            if(e.movieTitle==film.movieTitle){
                if(e.availableSeat>=seats){
                    e.availableSeat -= seats;
                    Booking baru = new Booking(film,seats,generateId());
                    daftarBooking.add(baru);
                    System.out.println("\nPesanan berhasil dengan detail");
                    System.out.printf("Judul : %s\n",baru.film.movieTitle);
                    System.out.printf("Jumlah : %d\n",baru.seat);
                    System.out.printf("Booking ID : %d\n",baru.id);
                    return;
                }
            }
        }
        System.out.printf("\nPesanan %s gagal\n\n",film.movieTitle);
    }
    int generateId(){
        // return String.format("00%d",daftarBooking.size()+1);
        return daftarBooking.size()+1;
    }
    void displayBooking(){
        for(Booking e:daftarBooking){
            System.out.printf("Pesanan %d\n",e.id);
            System.out.printf("Film %s\n",e.film.movieTitle);
            System.out.printf("Jumlah %d kursi\n",e.seat);
        }

    }
    void searchBooking(int idBook){
        for(Booking e:daftarBooking){
            if(e.id==idBook){
                System.out.printf("\nPesanan %d\n",e.id);
                System.out.printf("Film : %s\n",e.film.movieTitle);
                System.out.printf("Jumlah : %d kursi\n",e.seat);
                return;
            }
        }
        System.out.printf("\nPesanan %d tidak ditemukan\n",idBook);
    }
}