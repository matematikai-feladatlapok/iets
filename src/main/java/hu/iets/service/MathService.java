package hu.iets.service;

import hu.iets.model.Task;

public class MathService {

    // https://prog.hu/cikkek/821/matematikai-kifejezesek-ertelmezese
    // https://levelup.gitconnected.com/create-and-evaluate-simple-expression-tree-in-python-in-object-oriented-style-5eb27b6376c8
    //https://medium.com/swlh/build-binary-expression-tree-in-python-36c04123e57b

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
