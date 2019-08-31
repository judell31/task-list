package com.judell.task_list.menu;

import com.judell.task_list.actions.Action;
import com.judell.task_list.actions.AddTask;

import java.util.HashMap;

public class Menu {
    private static HashMap<Integer, Action> menuMap = new HashMap<>();

    static {
        menuMap.put(1, new AddTask());
    }

    public static HashMap<Integer, Action> menu(){
        return menuMap;
    }
}
