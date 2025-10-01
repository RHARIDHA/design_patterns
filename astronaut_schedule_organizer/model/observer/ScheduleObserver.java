import java.util.List;

public interface ScheduleObserver {
    void onScheduleUpdate(List<Task> currentSchedule);
    void onScheduleConflict(Task conflictTask);
}
