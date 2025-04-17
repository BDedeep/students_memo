package com.example.student_memo.repository;

import com.example.student_memo.model.Student;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByMarksGreaterThan(int marks);

    List<Student> findByMarksLessThan(int marks);

    List<Student> findByMarksLessThanEqual(int marks);

    List<Student> findByMarksGreaterThanEqual(int marks);

    List<Student> findBySubjectIgnoreCaseAndMarksGreaterThanEqual(String subject, int marks);

    List<Student> findByIsPresentFalse();

    List<Student> findByMarksBetween(int min, int max);
}
