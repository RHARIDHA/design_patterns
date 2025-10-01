import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.addObserver(new ConsoleLoggerObserver());
        manager.addObserver(new ConflictObserver());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAstronaut Schedule Organizer");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Schedule");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Start time (HH:mm): ");
                        LocalTime start = LocalTime.parse(scanner.nextLine());
                        System.out.print("End time (HH:mm): ");
                        LocalTime end = LocalTime.parse(scanner.nextLine());
                        System.out.print("Task type (SCIENCE, MAINTENANCE, EXERCISE, COMMUNICATION, PERSONAL): ");
                        TaskType type = TaskType.valueOf(scanner.nextLine().toUpperCase());

                        Task task = TaskFactory.createTask(name, start, end, type);
                        manager.addTask(task);
                        break;
                    case 2:
                        System.out.print("Name of Task to remove: ");
                        String removeName = scanner.nextLine();
                        Task toRemove = null;
                        for (Task t : manager.getTasks()) {
                            if (t.getName().equalsIgnoreCase(removeName)) {
                                toRemove = t;
                                break;
                            }
                        }
                        if (toRemove != null) {
                            manager.removeTask(toRemove);
                        } else {
                            System.out.println("Task not found.");
                        }
                        break;
                    case 3:
                        System.out.println("Current Schedule:");
                        for (Task t : manager.getTasks()) {
                            System.out.println(t);
                        }
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (ScheduleConflictException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}
