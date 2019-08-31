package com.judell.task_list.actions;

import com.judell.task_list.list.TaskList;
import com.judell.task_list.running_status.RunningStatus;

public class Exit implements Action {

    @Override
    public void action(TaskList action) {
        RunningStatus.exit();
    }
}
