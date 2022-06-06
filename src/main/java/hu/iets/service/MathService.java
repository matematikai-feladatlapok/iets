package hu.iets.service;

import hu.iets.model.Task;

public class MathService {

    private Task task;

    public MathService(Task task) {
        this.task = task;
    }

    public boolean IsTaskCorrect() {
        return TaskLeftSideEqualTaslRightSide();
    }

    private boolean TaskLeftSideEqualTaslRightSide() {
        return true;
    }

}
