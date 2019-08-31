package com.judell.task_list.menu;

import com.judell.task_list.actions.*;

import java.util.HashMap;

public class Menu {
    private static HashMap<Integer, Action> menuMap = new HashMap<>();

    static {
        menuMap.put(1, new AddTask());
        menuMap.put(2, new Remove());
        menuMap.put(3, new MarkDone());
        menuMap.put(4, new ListAllTasks());
        menuMap.put(5, new Exit());
    }

    public static HashMap<Integer, Action> menu(){
        return menuMap;
    }
}
