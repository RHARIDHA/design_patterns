import java.time.LocalTime;

public class Task {
    private String name;
    private LocalTime startTime;
    private LocalTime endTime;
    private TaskType type;

    public Task(String name, LocalTime startTime, LocalTime endTime, TaskType type) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public TaskType getType() {
        return type;
    }

    public boolean overlaps(Task other) {
        return !(this.endTime.isBefore(other.startTime) || this.startTime.isAfter(other.endTime));
    }

    @Override
    public String toString() {
        return name + " [" + startTime + " - " + endTime + "] Type: " + type;
    }
}
