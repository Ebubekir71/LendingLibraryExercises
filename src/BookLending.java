import java.time.LocalDate;

public class BookLending {
    private Book book;
    private Customer customer;
    LocalDate startDate = LocalDate.now();
    LocalDate returnDate;

    public BookLending(Customer customer, Book book, LocalDate startDate) {
        this.customer = customer;
        this.book = book;
        this.startDate = startDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
