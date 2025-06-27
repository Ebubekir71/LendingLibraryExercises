import java.time.LocalDate;

public class MovieLending {
    private Customer customer;
    private Movie item;
    LocalDate startDate;
    LocalDate returnDate;

    public MovieLending(Customer customer, Movie item, LocalDate startDate) {
        this.customer = customer;
        this.item = item;
        this.startDate = startDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Movie getMovie() {
        return item;
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

}
