package hu.iets.service;

import hu.iets.mathalgebra.ExpressionEvaluator;
import hu.iets.model.Task;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Hashtable;
import java.util.List;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class MathService {

    // https://prog.hu/cikkek/821/matematikai-kifejezesek-ertelmezese
    // https://levelup.gitconnected.com/create-and-evaluate-simple-expression-tree-in-python-in-object-oriented-style-5eb27b6376c8
    //https://medium.com/swlh/build-binary-expression-tree-in-python-36c04123e57b

    private Task task;

    public MathService(Task task) {
        this.task = task;
    }

    public boolean IsTaskCorrect() {
        return TaskLeftSideEqualTaskRightSide();
    }

    private boolean TaskLeftSideEqualTaskRightSide() {

        ExpressionEvaluator leftSideEvaluator=new ExpressionEvaluator(task.getLeftSide(),getVariablesFrom(task.getLeftSide(),task.getAnswer()));
        ExpressionEvaluator rightSideEvaluator=new ExpressionEvaluator(task.getRightSide(),null);

        double leftSide=leftSideEvaluator.Evaluate();
        double rightSide=rightSideEvaluator.Evaluate();

        if (leftSide==rightSide)
            return true;
        else
            return false;
    }

    private Hashtable<Character,Double> getVariablesFrom(String leftSide, List<String> answer) {
        if (answer.size()==0)
            return null;
        else {
            CharacterIterator iterator=new StringCharacterIterator(leftSide);
            Hashtable<Character,Double> result=new Hashtable<>();
            int numberOfAnswer=0;
            while (iterator.current()!=CharacterIterator.DONE) {
                if (isLetter(iterator.current())) {
                    Character resultCharacter=iterator.current();
                    double answer.get(numberOfAnswer)

                    result.put()
                }
            }

        }

        return null;
    }

}
