

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Soyisim", "Isim");
        Book book = new Book(1234567890, "Kelebek Vadisi", author);

        Actor actor = new Actor("Samanth", "Kevin");
        Actor actor2 = new Actor("Löwen", "Simith");

        Movie movie = new Movie(1234567890, "Vadiye Dönüs");

        Customer customer = new Customer("Ali", "Yilmaz", "ali@gmail.com");
        Actor actor3 = new Actor("Ebubekir", "Tosun");
        Person person = new Person("Süleyman", "Sah");

        System.out.println(customer.getFirstName()+ customer.getLastName() + customer.getEmail() +"/////////////////////////////////");
        System.out.println(actor3.getFirstName()+ actor3.getLastName()+ "/////////////");
        System.out.println(person.getFirstName()+ person.getLastName()+"//////");


        LendingManager lendingManager = new LendingManager();
        boolean ok = lendingManager.lendMovie(customer, movie);
        System.out.println(movie.getState());
        System.out.println(lendingManager.getNumberOfBookLendings());

        System.out.println(customer.getFirstName() + " " + customer.getLastName());
        System.out.println(customer.getEmail());

        movie.addActor(actor);
        movie.addActor(actor2);

        for (Actor a : movie.getActors()) {
            System.out.println(a.getFirstName() + " " + a.getLastName());
        }


    }
}