import java.util.ArrayList;
import java.util.List;

public class Movie extends LendingItem{
    private List<Actor> actors =  new ArrayList<Actor>();

    public Movie(long id, String title) {
        super(id, title);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }
    public List<Actor> getActors() {
        return actors;
    }
}
