import java.util.ArrayList;
import java.util.List;

public class Movie {
    private List<Actor> actors =  new ArrayList<Actor>();
    private long id;
    private String title;

    public Movie(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }
    public List<Actor> getActors() {
        return actors;
    }
}
