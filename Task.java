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
        return "Task:";
    }
}