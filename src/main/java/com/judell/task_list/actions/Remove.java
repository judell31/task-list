package com.judell.task_list.actions;

import com.judell.task_list.list.TaskList;

import java.util.Scanner;

public class Remove implements Action{

    @Override
    public void action(TaskList action) {
        int task = 1;
        System.out.println("\nThese are the items in your list");

        for (int x = 0; x < action.listSize(); x++){
            System.out.println(task++ + ". " + action.list().get(x));
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\nSelect an item to delete: ");
        int remove = input.nextInt();
        int choice = remove - 1;

        System.out.println("\n'" + action.list().get(choice) + "'" + " was removed from your list");
        action.list().remove(choice);
        System.out.println("Your new list size is: " + action.listSize());
    }
}
