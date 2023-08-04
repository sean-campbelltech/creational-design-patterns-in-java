package com.campbelltech;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        // Clone teacher
        Teacher teacher = new Teacher("Sean", "Creational Design Patterns in Java");
        Teacher teacherClone = (Teacher)teacher.clone();
        System.out.println(MessageFormat.format(
                "Teacher was cloned: {0} that teaches {1}",
                teacherClone.getName(), teacherClone.getCourse())
        );

        // Clone student
        Student student = new Student("James", teacherClone);
        Student studentClone = student.clone();
        System.out.println(MessageFormat.format(
                "Student was cloned: {0} that is enrolled in {1}''s course",
                studentClone.getName(), studentClone.getTeacher().getName())
        );

        // Change teacher's name
        teacherClone.setName("John");
        System.out.println(MessageFormat.format(
                "Student was cloned: {0} that is enrolled in {1}''s course",
                studentClone.getName(), studentClone.getTeacher().getName())
        );
    }
}