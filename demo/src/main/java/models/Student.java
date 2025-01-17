package models;

import interfaces.Learner;

public class Student extends Person implements Learner {

    double totalStudyTime;
    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime= totalStudyTime;
    }


    @Override
    public void learn(double numberOfHours) {
         totalStudyTime+=numberOfHours;
    }
    public double getTotalStudyTime(){
        return this.totalStudyTime;
    }

}
