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
    public boolean returnBook(Book book){
        for(BookLending lend : bookLendings){
            if(lend.getBook() == book && lend.getReturnDate() == null){
                lend.setReturnDate(LocalDate.now());
                book.setState(State.AVAILABLE);
                return true;
            }
        }return false;
    }
    public boolean returnMovie(Movie movie){
        for (MovieLending lend : movieLendings){
            if (lend.getMovie() == movie && lend.getReturnDate() == null){
                lend.setReturnDate(LocalDate.now());
                movie.setState(State.AVAILABLE);
                return true;
            }
        }return false;
    }


    public int getNumberOfBookLendings() {
        return bookLendings.size();
    }

}
