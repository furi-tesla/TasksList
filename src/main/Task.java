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

        System.out.printf("%n\u2610 %s%n\u2757 Priority: %s%n", description, priority);
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
        System.out.printf("%n\u2610 %s%n\u2757 Priority: %s%n\u25f7 Due by: %s%n%% Progress percent: %d%%%n\u2714 Completion status: %b%n\u2731 Overdue status: %b%n", description, priority, dueBy, progressPct, isCompleted, isOverdue);
    }

    public void progress(int progressPct) {
        int tempValue = this.progressPct + progressPct;
        if (progressPct > 0 && tempValue <= 100) {
            this.progressPct += progressPct;
            System.out.printf("%n%d%% progress made on task %s! " +
                    "%n\u2728Great job!\u2728%n", progressPct, description);
        } else {
            System.out.printf("%n\u274c Invalid progress specified." +
                    "%n\u27b3 Progress amount must not exceed 100%%.");
        }
    }
    public void complete() {
        this.isCompleted = true;
        this.progressPct = 100;

        System.out.printf("%n\u2611 %s \u2794 completed!%n\u2728Great job!\u2728%n", description);
    }

    @Override
    public String toString() {
        return "\n" + (isCompleted ? "\u2611 " : "\u2610 ") + description +
                "\n\u2757 Priority: " + priority +
                "\n\u25f7 Due by: " + dueBy +
                "\n% Progress percent: " + progressPct +
                "%\n\u2714 Completion status: " + isCompleted +
                "\n\u2731 Overdue status: " + isOverdue;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        try {
            return priority;
        } catch (NullPointerException npe) {
            return "not specified";
        }
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDueBy() {
        return dueBy;
    }

    public void setDueBy(String dueBy) {
        this.dueBy = dueBy;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public int getProgressPct() {
        return progressPct;
    }

    public void setProgressPct(int progressPct) {
        this.progressPct = progressPct;
    }

    public boolean isOverdue() {
        return isOverdue;
    }

    public void setOverdue(boolean overdue) {
        isOverdue = overdue;
    }
}
