package hu.iets.model;

public class AjaxResponseBody {

    private boolean taskCorrect;
    private String errorMessage;

    public AjaxResponseBody() {
        this.taskCorrect = true;
        errorMessage="";
    }

    public void setTaskCorrect() {
        this.taskCorrect = true;
    }

    public void setTaskIncorecct() {
        this.taskCorrect = false;
    }

    public boolean isTaskCorrect() {
        return taskCorrect;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
