package pl.training.zadanie06;

public class Program {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.printTasks();

        taskManager.addTask("Zadanie 1", "Zrobić zakupy w sklepie");
        taskManager.addTask("Zadanie 2", "Iść na spacer");
        taskManager.addTask("Zadanie 3", "Iść na spacer");
        taskManager.addTask("Zadanie 4", "Iść na spacer");
        taskManager.addTask("Zadanie 5", "Iść na spacer");
        taskManager.addTask("Zadanie 6", "Iść na spacer");
        taskManager.addTask("Zadanie 7", "Iść na spacer");
        taskManager.addTask("Zadanie 8", "Iść na spacer");
        taskManager.addTask("Zadanie 9", "Iść na spacer");
        taskManager.addTask("Zadanie 10", "Iść na spacer");
        taskManager.addTask("Zadanie 11", "Odrobić lekcje");
        taskManager.printTasks();

        taskManager.markTaskAsDoneV1(0);
        taskManager.printTasks();

        taskManager.markTaskAsDoneV2(2);
        taskManager.printTasks();

        taskManager.markTaskAsDoneV2(15);
        taskManager.printTasks();

        taskManager.removeTask(0);
        taskManager.printTasks();


    }
}
