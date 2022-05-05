package hu.iets.model;

public class Task {

    String leftSide;
    String rightSide;
    String answer;

    public Task(String leftSide, String rightSide, String answer) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.answer = answer;
    }

    public Task() {
        leftSide = "";
        rightSide = "";
        answer = "";
    }

    public String getLeftSide() {
        return leftSide;
    }

    public String getRightSide() {
        return rightSide;
    }

    public String getAnswer() {
        return answer;
    }

    public void setLeftSide(String leftSide) {
        this.leftSide = leftSide;
    }

    public void setRightSide(String rightSide) {
        this.rightSide = rightSide;
    }

    public void setAnswer(String answer) {
        this.answer = answer;

    }
}
