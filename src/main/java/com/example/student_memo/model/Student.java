package com.example.student_memo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id

    private Long id;
    private String name;
    private String subject;
    private int marks;
    private boolean isPresent;

    public Student(Long id, String name, String subject, int marks, boolean isPresent) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.isPresent = isPresent;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    public boolean isPresent() { return isPresent; }
    public void setPresent(boolean isPresent) { this.isPresent = isPresent; }
}
