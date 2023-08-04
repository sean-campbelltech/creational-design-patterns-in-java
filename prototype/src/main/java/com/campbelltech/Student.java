package com.campbelltech;

// ConcretePrototype2
public class Student extends Person {
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        super(name);
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public Student clone() {
        Student studentCopy = (Student)super.clone();
        studentCopy.setTeacher(new Teacher(studentCopy.getTeacher().getName(), studentCopy.getTeacher().getCourse()));
        return studentCopy;
    }
}
