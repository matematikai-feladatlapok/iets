package hu.iets.controller;

import hu.iets.model.AjaxResponseBody;
import hu.iets.model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
public class TaskController {

    @PostMapping("/api/task")
    public ResponseEntity<?> getTaskDataViaAjax(@RequestBody Task task, Errors errors) {

        AjaxResponseBody result=new AjaxResponseBody();

        if (errors.hasErrors()) {

            result.setErrorMessage(errors.getAllErrors()
                    .stream().map(x -> x.getDefaultMessage())
                    .collect(Collectors.joining(",")));
            return ResponseEntity.badRequest().body(result);
        }

        if (task.getAnswer().equals("3"))
            result.setTaskCorrect();
        else
            result.setTaskIncorecct();

        return ResponseEntity.ok(result);
    }
}
