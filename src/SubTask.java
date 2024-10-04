public class SubTask extends Task {

    private int parentEpicID;

    public int getParentEpicID() {
        return parentEpicID;
    }

    public void setParentEpicID(int parentEpicID) {
        this.parentEpicID = parentEpicID;
    }

    public SubTask(String name, String description, int id, Status status, int parentEpicID) {
        super(name, description, id, status); // Инициализация полей Task
        this.parentEpicID = parentEpicID;     // Инициализация поля SubTask
    }

}
