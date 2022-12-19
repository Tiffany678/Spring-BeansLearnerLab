package models;

import java.util.Iterator;

public class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
        this.add(new Student(1, "Ari",10));
        this.add(new Student(2, "Ben",20));
        this.add(new Student(3, "Carolina",30));
        this.add(new Student(4, "Eryk",40));

    }

    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] getArray() {
        return this.toArray(new Student[0]);
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }
}
