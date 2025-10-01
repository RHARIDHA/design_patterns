public class ConflictObserver implements ScheduleObserver {
    @Override
    public void onScheduleUpdate(List<Task> currentSchedule) {
        // No action on update
    }

    @Override
    public void onScheduleConflict(Task conflictTask) {
        System.out.println("Conflict detected for task: " + conflictTask);
    }
}
