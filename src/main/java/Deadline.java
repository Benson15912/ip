public class Deadline extends Task{
    private String date;
    public Deadline(String description, String date) {
        super(description);
        this.date = date;
    }

    @Override
    public String getTypeIcon() {
        return "D";
    }

    @Override
    public String getDescription() {
        return String.format("%s (by: %s)", this.description, this.date);
    }
    public String getCommand() {
        return String.format("deadline %s /by %s\n%b\n", this.description, this.date, this.isDone);
    }
}
