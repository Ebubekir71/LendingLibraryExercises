public class Customer extends Person {
    private String email;

    public Customer(String firstName, String lastName, String email) {
        super(lastName, firstName);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
