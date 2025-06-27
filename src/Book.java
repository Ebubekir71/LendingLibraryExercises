public class Book extends LendingItem{
    private Author author;

    public Book(long id, String title, Author author) {
        super(id, title);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }


}
