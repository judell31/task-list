package com.judell.task_list.list;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> taskList = new ArrayList<>();

    public void addItem(String add){
        taskList.add(add);
    }

    public Integer listSize(){
        return taskList.size();
    }

    public List list(){
        return taskList;
    }
}
