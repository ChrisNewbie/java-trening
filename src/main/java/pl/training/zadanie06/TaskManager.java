package pl.training.zadanie06;

public class TaskManager {

    private static final int MAX_NUMBER_OF_TASKS = 10;
    private Task[] tasks; //tablica z zadaniami
    private int numberOfCurrentTasks;

    public TaskManager() {
        this.tasks = new Task[MAX_NUMBER_OF_TASKS];
        this.numberOfCurrentTasks = 0; // bo na starcie nie ma zadań
    }

    public void addTask(String name, String description) {
        if (numberOfCurrentTasks >= MAX_NUMBER_OF_TASKS) {
            System.out.println("Nie można dodać więcej zadań.");
            return;
        }
        Task task = new Task(name, description);
        tasks[numberOfCurrentTasks++] = task;
        System.out.println("Dodano zadanie: " + task);
    }

    public void printTasks() {
        System.out.println("Liczba zadań to: " + numberOfCurrentTasks);
        System.out.println("Lista zadań: ");
        for (int i = 0; i < numberOfCurrentTasks; i++) {
            System.out.println(tasks[i]);
        }
    }

    public void markTaskAsDoneV1(int index) {
        Task task = tasks[index];
        task.setDone(true);
    }

    public void markTaskAsDoneV2(int index) {
        if (index < 0 || index >= numberOfCurrentTasks) {
            System.out.println("Nie ma zadania o numerze " + index);
            return;
        }
        var task = tasks[index];
        if (!task.isDone()) {
            task.setDone(true);
            System.out.println("Zadanie o numerze " + index + " zostało zakończone.");
        } else {
            System.out.println("Zadanie o numerze " + index + " zostało już wcześniej zakończone.");
        }
    }
}
