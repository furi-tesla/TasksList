package main;

import javax.swing.text.Highlighter;

public class CodeTester {
    public static void main(String[] args) {
//        Task taskOne = new Task("Replace headphones at Best Buy");
//        Task taskTwo = new Task("Pack up clothes", "high","20-04-2023",5);
//        taskOne.complete();
//        taskTwo.progress(0);
//        System.out.println(taskTwo);
//
//        TasksList list = new TasksList(taskTwo,taskOne);
//
//        list.priority();


        Task taskOne = new Task("Esyalari paketle", "high", "20-04-2023",10);
        Task taskTwo = new Task("Copu bosalt", "medium", "20-04-2023", 0);
        Task taskThree = new Task("Camasir yikama", "high", "22-04-2023", 0);

        taskThree.progress(30);
        taskTwo.complete();

        Task [] list = {taskOne, taskTwo, taskThree};

        TasksList taskslist = new TasksList(list);

        taskslist.priority();

        Task one = new Task("shower");
        Task two = new Task("brush teeth");

        Task [] list2 = {one, two};
    }
}
