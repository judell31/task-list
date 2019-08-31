package com.judell.task_list.actions;

import com.judell.task_list.list.TaskList;

import java.util.Scanner;

public class MarkDone implements Action {
    private final static String DONE = "-[DONE]";

    @Override
    public void action(TaskList action) {
        int task = 1;

        System.out.println("\nYour todo list");
        for (int x = 0; x < action.list().size(); x++){
            System.out.println(task++ + ". " + action.list().get(x));
        }

        Scanner finished = new Scanner(System.in);
        System.out.println("\nWhat did you complete?: ");
        int scanned = finished.nextInt() - 1;

        System.out.println("'" + action.list().get(scanned) + "'" + " has been completed");
        action.list().set(scanned, action.list().get(scanned) + DONE);
    }
}
