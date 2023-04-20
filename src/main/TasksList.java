package main;

public class TasksList {
    private Task firstTask;
    private Task secondTask;
    private Task thirdTask;
    private Task fourthTask;
    private Task fifthTask;
    private Task sixthTask;
    private Task seventhTask;
    private Task eighthTask;
    private Task ninthTask;
    private Task tenthTask;

    public TasksList(Task task) {
        firstTask = task;
    }

    public TasksList(Task taskOne, Task taskTwo) {
        firstTask = taskOne;
        secondTask = taskTwo;
    }

    public TasksList(Task taskOne, Task taskTwo, Task taskThree) {
        firstTask = taskOne;
        secondTask = taskTwo;
        thirdTask = taskThree;
    }

    public TasksList(Task taskOne, Task taskTwo,
                     Task taskThree, Task taskFour) {
        firstTask = taskOne;
        secondTask = taskTwo;
        thirdTask = taskThree;
        fourthTask = taskFour;
    }

    public TasksList(Task taskOne, Task taskTwo,
                     Task taskThree, Task taskFour,
                     Task taskFive) {
        firstTask = taskOne;
        secondTask = taskTwo;
        thirdTask = taskThree;
        fourthTask = taskFour;
        fifthTask = taskFive;
    }

    public TasksList(Task taskOne, Task taskTwo,
                     Task taskThree, Task taskFour,
                     Task taskFive, Task taskSix) {
        firstTask = taskOne;
        secondTask = taskTwo;
        thirdTask = taskThree;
        fourthTask = taskFour;
        fifthTask = taskFive;
        sixthTask = taskSix;
    }

    public TasksList(Task taskOne, Task taskTwo,
                     Task taskThree, Task taskFour,
                     Task taskFive, Task taskSix,
                     Task taskSeven) {
        firstTask = taskOne;
        secondTask = taskTwo;
        thirdTask = taskThree;
        fourthTask = taskFour;
        fifthTask = taskFive;
        sixthTask = taskSix;
        seventhTask = taskSeven;
    }

    public TasksList(Task taskOne, Task taskTwo,
                     Task taskThree, Task taskFour,
                     Task taskFive, Task taskSix,
                     Task taskSeven, Task taskEight) {
        firstTask = taskOne;
        secondTask = taskTwo;
        thirdTask = taskThree;
        fourthTask = taskFour;
        fifthTask = taskFive;
        sixthTask = taskSix;
        seventhTask = taskSeven;
        eighthTask = taskEight;
    }

    public TasksList(Task taskOne, Task taskTwo,
                     Task taskThree, Task taskFour,
                     Task taskFive, Task taskSix,
                     Task taskSeven, Task taskEight,
                     Task taskNine) {
        firstTask = taskOne;
        secondTask = taskTwo;
        thirdTask = taskThree;
        fourthTask = taskFour;
        fifthTask = taskFive;
        sixthTask = taskSix;
        seventhTask = taskSeven;
        eighthTask = taskEight;
        ninthTask = taskNine;
    }

    public TasksList(Task taskOne, Task taskTwo,
                     Task taskThree, Task taskFour,
                     Task taskFive, Task taskSix,
                     Task taskSeven, Task taskEight,
                     Task taskNine, Task taskTen) {
        firstTask = taskOne;
        secondTask = taskTwo;
        thirdTask = taskThree;
        fourthTask = taskFour;
        fifthTask = taskFive;
        sixthTask = taskSix;
        seventhTask = taskSeven;
        eighthTask = taskEight;
        ninthTask = taskNine;
        tenthTask = taskTen;
    }

    public void priority() {
        highPriority();
        medPriority();
        lowPriority();
    }
    public void highPriority() {

        if (highPriority(firstTask)) {
            System.out.println(firstTask);
        }

        if (highPriority(secondTask)) {
            System.out.println(secondTask);
        }

        if (highPriority(thirdTask)) {
            System.out.println(thirdTask);
        }

        if (highPriority(fourthTask)) {
            System.out.println(fourthTask);
        }

        if (highPriority(fifthTask)) {
            System.out.println(fifthTask);
        }

        if (highPriority(sixthTask)) {
            System.out.println(sixthTask);
        }

        if (highPriority(seventhTask)) {
            System.out.println(seventhTask);
        }

        if (highPriority(eighthTask)) {
            System.out.println(eighthTask);
        }

        if (highPriority(ninthTask)) {
            System.out.println(ninthTask);
        }

        if (highPriority(tenthTask)) {
            System.out.println(tenthTask);
        }
    }

    public void medPriority() {

        if (medPriority(firstTask)) {
            System.out.println(firstTask);
        }

        if (medPriority(secondTask)) {
            System.out.println(secondTask);
        }

        if (medPriority(thirdTask)) {
            System.out.println(thirdTask);
        }

        if (medPriority(fourthTask)) {
            System.out.println(fourthTask);
        }

        if (medPriority(fifthTask)) {
            System.out.println(fifthTask);
        }

        if (medPriority(sixthTask)) {
            System.out.println(sixthTask);
        }

        if (medPriority(seventhTask)) {
            System.out.println(seventhTask);
        }

        if (medPriority(eighthTask)) {
            System.out.println(eighthTask);
        }

        if (medPriority(ninthTask)) {
            System.out.println(ninthTask);
        }

        if (medPriority(tenthTask)) {
            System.out.println(tenthTask);
        }
    }

    public void lowPriority() {

        if (lowPriority(firstTask)) {
            System.out.println(firstTask);
        }

        if (lowPriority(secondTask)) {
            System.out.println(secondTask);
        }

        if (lowPriority(thirdTask)) {
            System.out.println(thirdTask);
        }

        if (lowPriority(fourthTask)) {
            System.out.println(fourthTask);
        }

        if (lowPriority(fifthTask)) {
            System.out.println(fifthTask);
        }

        if (lowPriority(sixthTask)) {
            System.out.println(sixthTask);
        }

        if (lowPriority(seventhTask)) {
            System.out.println(seventhTask);
        }

        if (lowPriority(eighthTask)) {
            System.out.println(eighthTask);
        }

        if (lowPriority(ninthTask)) {
            System.out.println(ninthTask);
        }

        if (lowPriority(tenthTask)) {
            System.out.println(tenthTask);
        }
    }

    public boolean highPriority(Task task) {
        boolean isHighPriority;
        try {
            isHighPriority = task.getPriority().equalsIgnoreCase("high");
        } catch (NullPointerException npe) {
            return false;
        }

        return isHighPriority;
    }

    public boolean medPriority(Task task) {
        boolean isMedPriority;
        try {
            isMedPriority = task.getPriority().equalsIgnoreCase("medium");
        } catch (NullPointerException npe) {
            return false;
        }

        return isMedPriority;
    }

    public boolean lowPriority(Task task) {
        boolean isLowPriority;
        try {
            isLowPriority = task.getPriority().equalsIgnoreCase("low");
        } catch (NullPointerException npe) {
            return false;
        }

        return isLowPriority;
    }

    public boolean isOverdue(Task task) {
        boolean isOverdue;
        try {
            isOverdue = task.isOverdue();
        } catch (NullPointerException npe) {
            return false;
        }
        return isOverdue;
    }
    public void dueBy() {

    }

    public void progressPct() {

    }

    public void motivationPct() {

    }

    public void completed() {

    }

    public void inProgress() {

    }

    public void notStarted() {

    }

    public void overDue() {
        if (isOverdue(firstTask)) {
            System.out.println(firstTask);
        }

        if (isOverdue(secondTask)) {
            System.out.println(secondTask);
        }

        if (isOverdue(thirdTask)) {
            System.out.println(thirdTask);
        }

        if (isOverdue(fourthTask)) {
            System.out.println(fourthTask);
        }

        if (isOverdue(fifthTask)) {
            System.out.println(fifthTask);
        }

        if (isOverdue(sixthTask)) {
            System.out.println(sixthTask);
        }

        if (isOverdue(seventhTask)) {
            System.out.println(seventhTask);
        }

        if (isOverdue(eighthTask)) {
            System.out.println(eighthTask);
        }

        if (isOverdue(ninthTask)) {
            System.out.println(ninthTask);
        }

        if (isOverdue(tenthTask)) {
            System.out.println(tenthTask);
        }
    }
}
