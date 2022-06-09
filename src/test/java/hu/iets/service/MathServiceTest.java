package hu.iets.service;

import hu.iets.model.Task;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {

    public void testAlgebricExpressionIntegerCoefficients() {
        List<String> answer = new ArrayList<String>();
        answer.add("3");
        Task task = new Task("x+2", "5", answer);

        MathService mathService=new MathService(task);
        assertTrue(mathService.IsTaskCorrect());
    }

}