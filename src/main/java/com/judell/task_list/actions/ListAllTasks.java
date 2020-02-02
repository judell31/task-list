package com.judell.task_list.actions;

import com.judell.task_list.list.TaskList;
import com.judell.task_list.running_status.RunningStatus;

public class ListAllTasks implements Action {
    RunningStatus x = new RunningStatus();

    @Override
    public void action(TaskList action) {
        int task = 1;

        System.out.println("\nYour todo list");
        for(int x = 0; x < action.list().size(); x++){
            System.out.println(task++ + ". " + action.list().get(x));
        }
    }
}
