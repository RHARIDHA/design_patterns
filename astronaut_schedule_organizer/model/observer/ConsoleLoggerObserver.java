import java.util.List;

public class ConsoleLoggerObserver implements ScheduleObserver {
    @Override
    public void onScheduleUpdate(List<Task> currentSchedule) {
        System.out.println("Updated Schedule:");
        for (Task t : currentSchedule) {
            System.out.println(" - " + t);
        }
    }

    @Override
    public void onScheduleConflict(Task conflictTask) {
        System.out.println("Logging conflict for task: " + conflictTask);
    }
}
