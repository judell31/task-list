package com.judell.task_list.read_input;

import com.judell.task_list.list.TaskList;
import com.judell.task_list.menu.Menu;

import java.util.Scanner;

public class ReadInput {
    private static Scanner input = new Scanner(System.in);
    private static TaskList taskList = new TaskList();
    private static Menu menu = new Menu();

    private static String opts = "\n---------------" +
            "\n1 -> Add Task" +
            "\n2 -> Remove Task" +
            "\n3 -> Mark Done" +
            "\n4 -> List Task" +
            "\n5 -> Exit" +
            "\n---------------";

    private static String prompt = "\nSelect an option: ";

    public static String read(){
        System.out.println(opts);
        System.out.println(prompt);
        String scanned = input.nextLine();
        var parseInt = Integer.parseInt(scanned);

        if(menu.menu().containsKey(parseInt)){
            menu.menu().get(parseInt).action(taskList);
        }
        return scanned;
    }
}
