import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {

   private Map<Integer,Task> taskMap;
    private List <Task> taskList;
    private List<SubTask> subTaskList;
    private List<Epic> epicList;

    private int counter;





    public void getAllTasks() {

    }
    public void getAllEpics() {

    }
    public void getAllSubTasks(){

    }

    public  void removeAllTask() {

    }

    public void getTaskById(int id){

    }

   public void addTask(Task task){

   }
    public void addEpic(Epic epic) {

    }
    public void addSubTask(SubTask subTask){

    }

    public void updateTask(Task task){

    }

    public void removeTaskById(int id){

    }

    public void getSubTaskByEpic(Epic epic) {

    }



    public  TaskManager() {
        Map<Integer, Task> taskMap = new HashMap<>();
        List<Task> taskList = new ArrayList<>();
        List<SubTask> subTaskList = new ArrayList<>();
        List<Epic> epicList = new ArrayList<>();
    }



}
