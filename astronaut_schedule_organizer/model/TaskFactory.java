import java.time.LocalTime;

public class TaskFactory {
    public static Task createTask(String name, LocalTime start, LocalTime end, TaskType type) {
        return new Task(name, start, end, type);
    }
}
