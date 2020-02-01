package duke.tasks;

public class ToDo extends Task {

    /**
     * Constructs a new ToDo object, a subclass of Task.
     * @param description String containing the description of the task
     */
    public ToDo(String description) {
        super(description);
    }


    /**
     * Formats this object as a String to be written into the data file.
     * @return String in the format T:;:isDone:;:description
     */
    @Override
    public String toDataString() {
        return "T:;:" + super.toDataString();
    }


    /**
     * Formats this object as a String to be printed out.
     * @return String for printing
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }


}