package com.example.student_memo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_memo.model.Student;
import com.example.student_memo.repository.StudentRepository;

@Service
public class StudentService {
    
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> filterByType(String type) {
        switch (type.toLowerCase()) {
            case "greaterthan90":
                return studentRepository.findByMarksGreaterThan(90);
            case "lessthan90":
                return studentRepository.findByMarksLessThan(90);
            case "failed":
                return studentRepository.findByMarksLessThanEqual(39);
            case "passed":
                return studentRepository.findByMarksGreaterThanEqual(40);
            case "mathsonly":
                return studentRepository.findBySubjectIgnoreCaseAndMarksGreaterThanEqual("Math", 40);
            case "absent":
                return studentRepository.findByIsPresentFalse();
            case "range40to50":
                return studentRepository.findByMarksBetween(40, 50);
            default:
                return studentRepository.findAll();
        }
    }
}
