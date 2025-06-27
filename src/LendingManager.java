import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LendingManager {
    private List<BookLending> bookLendings = new ArrayList<>();
    private List<MovieLending> movieLendings = new ArrayList<>();
    public int numberOfBookLendings;

    public LendingManager() {

    }
    public boolean lendBook(Customer customer, Book book){
        if(book.getState() != State.AVAILABLE){
            return false;
        }else {
            BookLending a1 = new BookLending(customer, book , LocalDate.now());
            bookLendings.add(a1);
            book.setState(State.LENT);
        }
        return true;
    }
    public boolean lendMovie(Customer customer, Movie movie){
        if(movie.getState() != State.AVAILABLE){
            return false;
        }else {
            MovieLending a1 = new MovieLending(customer, movie, LocalDate.now());
            movieLendings.add(a1);
            movie.setState(State.LENT);
        }
        return true;
    }


    public int getNumberOfBookLendings() {
        return bookLendings.size();
    }

}
