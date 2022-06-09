package hu.iets.model;

import java.util.List;

public class Task {

    String leftSide;
    String rightSide;
    List<String> answer;

    public Task(String leftSide, String rightSide, List<String> answer) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.answer = answer;
    }

    public Task() {
        leftSide = "";
        rightSide = "";
        answer = null;
    }

    public String getLeftSide() {
        return leftSide;
    }

    public String getRightSide() {
        return rightSide;
    }

    public List<String> getAnswer() {
        return answer;
    }

    public void setLeftSide(String leftSide) {
        this.leftSide = leftSide;
    }

    public void setRightSide(String rightSide) {
        this.rightSide = rightSide;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;

    }
}
