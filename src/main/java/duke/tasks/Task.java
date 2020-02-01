package duke.tasks;

public class Task {

    protected String description;
    protected boolean isDone;

    /**
     * Constructs a new Task object.
     * @param description String containing the description of the task
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }


    /**
     * Gets the status icons: "Y" is returned if the task is completed, otherwise "N" is returned.
     * @return String for the status icons
     */
    public String getStatusIcon() {
        return (isDone ? "Y" : "N"); // as ticks and X don't parse well on powershell
        //return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }


    /**
     * Sets the status of this task to done (Default: not done).
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Formats this object as a String to be written into the data file.
     * @return String in the format isDone:;:description
     */
    public String toDataString() {
        return (isDone ? "1" : "0") + ":;:" + this.description;
    }

    /**
     * Formats this object as a String to be printed out.
     * @return String for printing
     */
    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + this.description;
    }
}