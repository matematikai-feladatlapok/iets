package hu.iets.controller;

import hu.iets.model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @PostMapping("/api/task")
    public ResponseEntity<?> getTaskDataViaAjax(@RequestBody Task task, Errors errors) {

        String result = "ok";

        return ResponseEntity.ok(result);
    }
}
