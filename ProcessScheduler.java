/*
*@author John Vue
*@version 03/06/2024
*A Java Program that simulates a process scheduler.
*Uses a queue to manage tasks in a first come first serve manner.
*Uses a stack to temporarily hold and prioritize certain tasks. 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ProcessScheduler {
    public static void main(String[] args) {
        // Create a Scanner object to read from file
        
        try {
            Scanner file = new Scanner(new File("tasks.txt"));
            //scan the tasks file
            // Initialize task list array
            Task [] taskList = new Task [20];
            //Initialize the index to 0
            int index = 0;
            // Read tasks from file and populate task list array
            while (file.hasNextLine()) { // Loop through each line in the file
                String line = file.nextLine(); 
                // Split the line into tokens
                String [] tokens = line.split(",");
                // Fill in code to create a Task object from the tokens
                int taskIdToken = Integer.parseInt(tokens[0].trim());
                int priorityLevelToken = Integer.parseInt(tokens[1].trim());
                int executionTimeToken = Integer.parseInt(tokens[2].trim());
                // Fill in code to add the Task object to the task list array
                taskList[index] = new Task (taskIdToken, priorityLevelToken, executionTimeToken);
                //increment the index
                index++;
            }
            //close the file 
            file.close();
            // Initialize stack and queue
            Queue<Task> q = new LinkedList<>();
            Stack<Task> s = new Stack<>();
            // Separate tasks based on priority and push onto stack or enqueue
            for (Task task : taskList) {
               if (task != null) {
                  int priorityLevel = task.getPriorityLevel();
                  if (priorityLevel == 1 || priorityLevel == 2) {
                     s.push(task);
                  } else {
                     q.offer(task);
                  }
               }
            }
            // Process tasks in the stack
            System.out.println("Executing tasks in the following order:");
            int totalExecutionTimeStack = processTasks(s);
            //System.out.println("Total Execution Time for Priority Level 1 and 2 tasks in the stack: " + totalExecutionTimeStack);

           while (!s.isEmpty()) {
                Task task = s.pop();
                processTask(task);
           }

            // Process tasks in the queue
           //System.out.println("Executing tasks in the following order (Priority Level 2 and higher):");
           int totalExecutionTimeQueue = processTasks(q);
           //System.out.println("Total Execution Time for Priority Level 3 and higher tasks in the queue: " + totalExecutionTimeQueue);
           
           while (!q.isEmpty()) {
                Task task = q.remove();
                processTask(task);
           }
           
           int totalExecutionTime = totalExecutionTimeStack + totalExecutionTimeQueue;
           System.out.println("Total Execution Time for all tasks: " + totalExecutionTime);
           
        } catch (FileNotFoundException e) { // Catch block to handle file not found exception
            System.err.println("File not found: tasks.txt"); 
        }
    }
            private static void processTask(Task task) {
               System.out.println("Task ID: " + task.getTaskId() + ", Priority Level: " + task.getPriorityLevel() +
                ", Execution Time: " + task.getExecutionTime());
            }
            
            private static int processTasks(Queue<Task> taskQueue) {
               int totalExecutionTime = 0;
               while (!taskQueue.isEmpty()) {
                  Task task = taskQueue.remove();
                  processTask(task);
                  totalExecutionTime += task.getExecutionTime();
               }
               return totalExecutionTime;
            }
            
            private static int processTasks(Stack<Task> taskStack) {
            int totalExecutionTime = 0;
               while (!taskStack.isEmpty()) {
                  Task task = taskStack.pop();
                  processTask(task);
                  totalExecutionTime += task.getExecutionTime();
            }
            return totalExecutionTime;
    }
}

class Task {
    private int taskId; 
    private int priorityLevel; 
    private int executionTime;

    // Constructor to initialize task properties
    public Task(int taskId, int priorityLevel, int executionTime) {
       this.taskId = taskId;
       this.priorityLevel = priorityLevel;
       this.executionTime = executionTime;
    }

    // Getter method to retrieve task ID
    public int getTaskId() {
        return taskId;
    }

    // Getter method to retrieve priority level
    public int getPriorityLevel() {
        return priorityLevel;
    }

    // Getter method to retrieve execution time
    public int getExecutionTime() {
        return executionTime;
    }
    
    public String toString() {
        return "Task:" + getTaskId() + ", Priority Level: " + getPriorityLevel() +
                ", Execution Time: " + getExecutionTime();
    }
}
