package main;

public class TasksList {
    private Task [] list;

    public TasksList(Task [] list) {
        this.list = list;
    }
    public void priority() {

        for (int i = 0; i < list.length; i++) {
            if (isHigh(list[i])) {
                System.out.println(list[i]);
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (isMed(list[i])) {
                System.out.println(list[i]);
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (isLow(list[i])) {
                System.out.println(list[i]);
            }
        }
    }

    private boolean isHigh(Task task) {
        try {
            return task.getPriority().equalsIgnoreCase("high");
        } catch (NullPointerException npe) {
            return false;
        }
    }

    public boolean isMed(Task task) {
        try {
            return task.getPriority().equalsIgnoreCase("medium");
        } catch (NullPointerException npe) {
            return false;
        }
    }

    public boolean isLow(Task task) {
        try {
            return task.getPriority().equalsIgnoreCase("low");
        } catch (NullPointerException npe) {
            return false;
        }
    }

    public boolean isOverdue(Task task) {
        try {
            return task.isOverdue();
        } catch (NullPointerException npe) {
            return false;
        }
    }
    public void dueBy() {

    }

    public void progressPct() {

    }

    public void completed() {

    }

    public void inProgress() {

    }

    public void notStarted() {

    }

    public void overDue() {
        for (int i = 0; i < list.length; i++) {
            if (isOverdue(list[i])) {
                System.out.println(list[i]);
            }
        }
    }
}
