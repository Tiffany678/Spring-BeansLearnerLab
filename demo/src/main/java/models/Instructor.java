package models;

import interfaces.Learner;
import interfaces.Teacher;

public class Instructor extends Person implements Teacher {
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        Double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner l: learners){
            l.learn(numberOfHoursPerLearner);
        }
    }
}