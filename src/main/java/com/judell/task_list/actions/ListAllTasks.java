package com.judell.task_list.actions;

import com.judell.task_list.list.TaskList;

public class ListAllTasks implements Action {

    @Override
    public void action(TaskList action) {
        int task = 1;

        System.out.println("\nYour todo list");
        for(int x = 0; x < action.list().size(); x++){
            System.out.println(task++ + ". " + action.list().get(x));
        }
    }
}
