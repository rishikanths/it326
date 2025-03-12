package patterns.behavioral.cor.leave;

public class LeaveRequest {

    private int leaveDuration = 0;
    private String notes = "";
    private String output = "";

    public void setLeaveDuration(int duration) {
        this.leaveDuration = duration;
    }

    public int getLeaveDuration() {
        return leaveDuration;
    }

    public void addNotes(String notes){
        this.notes+= notes;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    @Override
    public String toString() {
        return "LeaveRequest [leaveDuration=" + leaveDuration + ", notes=" + notes + ", output=" + output + "]";
    }
    
}
