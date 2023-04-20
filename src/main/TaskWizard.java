package main;

import java.util.Scanner;

public class TaskWizard {

    public static void main(String[] args) {
        taskWizard();
    }

    public static void taskWizard() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u2728 Welcome to the Task Wizard! \u2728");
        System.out.println("""
                \u26a1 Here you will be prompted to enter 
                the following info for your task: \u26a1
                
                \u270d Task name / description
                \u2757 Priority level (high / medium / low)
                \u25f7 Due by (DD-MM-YYYY)
                % Starting progress percent 
                (0: not started - 100: completed)
                """);

        System.out.println("\u270d Task name / description:");

        String description = scanner.nextLine();

        System.out.println("\u2757 Priority level (high / medium / low):");

        String priority = scanner.nextLine();

        System.out.println("\u25f7 Due by (DD-MM-YYYY):");

        String dueBy = scanner.nextLine();

        System.out.println("% Starting progress percent (0-100):");

        int progressPct = scanner.nextInt();

        Task task = new Task(description, priority, dueBy, progressPct);
    }
}
