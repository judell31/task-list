package com.judell.task_list.running_status;

import com.judell.task_list.read_input.ReadInput;

public class RunningStatus {
    private static boolean isRunning;

    public static void running(){
        isRunning = true;
        while (isRunning){
            ReadInput.read();
        }
    }

    public static void exit(){
        isRunning = false;
        System.out.println("\nExiting Application...");
    }
}
