package com.judell.task_list.actions;

import com.judell.task_list.list.TaskList;

import java.util.Scanner;

public class AddTask implements Action{

    @Override
    public void action(TaskList action) {
        Scanner input = new Scanner(System.in);
        System.out.print("Add a task: ");
        String scanned = input.next();
        action.addItem(scanned);

        String listReport = "\nyou have " +
                action.listSize() +
                " task(s) in your todo list";

        System.out.println(listReport);

        System.out.println("Your todo list:" + "\n" + action.list());
    }
}
