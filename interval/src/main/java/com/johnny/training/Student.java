package com.johnny.training;

public class Student {
    private  int grades;
    private static int studentCount = 0;
    private String name;
    private int age;
    public enum courses{
        physique,chimie,bio,maths
    }
    Student(int age){
        this.age= age;
        System.out.println("Constructor of age");
    }
    Student(int grades , String name , int age) {
        this(age);
        this.grades = grades;
        this.name = name;
        this.studentCount++;

        System.out.println("Constructor created");
    }
    Student(String name){
        this.name = name;
        System.out.println("This is my empty constructor");
    }


    public void setGrades(int grades) {
        this.grades = grades;
    }
    public void setName (String name){
        this.name = name;
    }
    public int  getGrades(){
        return this.grades;
    }
    public String getName(){
        return this.name;
    }

    public void getStudentCount(){
        System.out.println(this.studentCount);
    }

    public int raiseGrade()
    {
        if(grades  < 100)
        {
            this.grades += 10;
        }else
        {
            this.warning();
        }
        return this.grades;
    }

    private void warning()
    {
        System.out.println("Mamnou3 tzid");
    }
    public void equalsStudents( Student s2){
        s2.grades = this.grades;
        s2.name = this.name;
    }
    public void bob (){
        this.setGrades(0);
    }
}
