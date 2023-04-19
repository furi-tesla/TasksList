package main;

import java.time.LocalDate;

public class Task {
    private String description;
    private String priority; // low, medium, high
    private String dueBy; // DD-MM-YYYY
    private boolean isCompleted;
    private int progressPct; // 0-100
    private boolean isOverdue;

    public Task(String description) {
        this(description, "medium");
    }

    public Task(String description, String priority) {
        this.description = description;
        this.priority = priority;

        System.out.printf("%nTask \"%s\" has been logged. %nPriority: %s", description, priority);
    }

    public Task(String description, String priority, String dueBy) {
        this(description,priority,dueBy, 0);
    }

    public Task(String description, String priority, String dueBy, int progressPct) {
        this.description = description;
        this.priority = priority;

        int dueYear;
        int dueMonth;
        int dueDay;
        try {
            dueYear = Integer.parseInt(dueBy.substring(6));
            dueMonth = Integer.parseInt(dueBy.substring(3,5));
            dueDay = Integer.parseInt(dueBy.substring(0,2));
        } catch (NumberFormatException nfe) {
            dueYear = -1;
            dueMonth = -1;
            dueDay = -1;
        }

        if (dueYear >= LocalDate.now().getYear()) {
            if (dueMonth >= LocalDate.now().getMonthValue()) {
                if (dueDay >= LocalDate.now().getDayOfMonth()) {
                    this.isOverdue = false;
                }
            }
        }

        this.dueBy = dueBy;

        if (progressPct >= 0 && progressPct <= 100) {
            this.progressPct = progressPct;
        }
        if (progressPct == 100) {
            this.isCompleted = true;
        } else {
            this.isCompleted = false;
        }
        System.out.printf("%nTask \"%s\" has been logged. %nPriority: %s%nDue by: %s%nProgress percent: %d%%%nCompletion status: %b%nOverdue status: %b", description, priority, dueBy, progressPct, isCompleted, isOverdue);
    }

    public void progress(int progressPct) {
        int tempValue = this.progressPct + progressPct;
        if (progressPct > 0 && tempValue <= 100) {
            this.progressPct += progressPct;
        } else {
            System.out.printf("%nInvalid progress specified.%nProgress amount must not exceed 100%%.");
        }
    }
    public void complete() {
        this.isCompleted = true;
        this.progressPct = 100;

        System.out.printf("%nTask \"%s\" has been completed!%nGreat job!", description);
    }

    @Override
    public String toString() {
        return "%nTask \"" +description +
                "\" has been logged. " +
                "%nPriority: " + priority +
                "%nDue by: " + dueBy +
                "%nProgress percent: " + progressPct +
                "%%%nCompletion status: " + isCompleted +
                "%nOverdue status: " + isOverdue;

    }
}
