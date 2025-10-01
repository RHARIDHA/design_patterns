import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance = null;
    private List<Task> tasks = new ArrayList<>();
    private List<ScheduleObserver> observers = new ArrayList<>();

    private ScheduleManager() {}

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addObserver(ScheduleObserver observer) {
        observers.add(observer);
    }

    public void addTask(Task task) throws ScheduleConflictException {
        for (Task t : tasks) {
            if (t.overlaps(task)) {
                notifyConflict(task);
                throw new ScheduleConflictException("Task overlaps with: " + t);
            }
        }
        tasks.add(task);
        notifyUpdate();
    }

    public void removeTask(Task task) {
        tasks.remove(task);
        notifyUpdate();
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    private void notifyUpdate() {
        for (ScheduleObserver obs : observers) {
            obs.onScheduleUpdate(tasks);
        }
    }

    private void notifyConflict(Task conflictTask) {
        for (ScheduleObserver obs : observers) {
            obs.onScheduleConflict(conflictTask);
        }
    }
}
