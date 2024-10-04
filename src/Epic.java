import java.util.ArrayList;
import java.util.List;

public class Epic extends Task {
    List<SubTask> listSubTask = new ArrayList<>();

    public Epic(String name, String description, int id, Status status) {
        super(name, description, id, status);
    }
}
