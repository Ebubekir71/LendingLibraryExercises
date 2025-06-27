import java.time.LocalDate;

public class Lending {
    private Customer customer;
    private LendingItem item;
    private LocalDate startDate;
    private LocalDate returnDate;

    public Lending(Customer customer, LendingItem item) {
        this.customer = customer;
        this.item = item;
        this.startDate = LocalDate.now();
    }

    public LocalDate getStartDate(){
        return LocalDate.now();
    }

    public Customer getCustomer() {
        return customer;
    }

    public LendingItem getItem() {
        return item;
    }

    public LocalDate getReturnDate(){
        return LocalDate.now();
    }
    public void setReturnDate(LocalDate returnDate){
        if (!item.isAvailable()){
            this.returnDate = LocalDate.now();
        }
    }
}
