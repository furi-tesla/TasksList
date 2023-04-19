package main;

public class CodeTester {
    public static void main(String[] args) {
        Task taskOne = new Task("Replace headphones at Best Buy");
        Task taskTwo = new Task("Pack up clothes", "high","20-04-2023",5);
        taskOne.complete();
        taskTwo.progress(0);

    }

}
