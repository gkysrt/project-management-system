package DomainLayer;

import java.util.ArrayList;
import java.util.List;

/**
 * Consultant class which is also subclass of Person.
 */
public class Consultant extends Person {

    private int id;
    private List<Integer> taskList = new ArrayList<>();

    public Consultant(int id){
        this.id = id;
    }

    @Override
    public void setId(int id) {
        if ((0 < id) && (id <= 1000)) {
            this.id = id;
        }
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public List<Integer> getTaskList() {
        return taskList;
    }

    @Override
    public int findTaskId(int number) {
        for (Integer taskId : taskList) {
            if(taskId == number) {
                return taskId;
            }
        }
        return -1;
    }

    @Override
    public void addTask(int taskId){
        if (!taskList.contains(taskId)) {
            taskList.add(taskId);
        }
    }

    @Override
    public void removeTask(int taskId) {
        taskList.remove(taskId);
    }

}
