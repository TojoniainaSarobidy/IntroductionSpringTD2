package controller;

import entity.StudentEntity;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public List<String> students(@RequestBody List<StudentEntity> students) {
        return studentService.createStudents(students);
    }

    @GetMapping("/students")
    public Object getStudents(@RequestHeader(value = "Accept", required = false) String accept) {
        if ("text/plain".equals(accept)) {
            return String.join(", ", studentService.getAllStudentNames());
        } else {
            return "Format non supporté";
        }
    }
}
