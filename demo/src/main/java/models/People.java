package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class People <E extends Person> implements Iterable<E>{
    ArrayList<E> personList= new ArrayList<>();



    public void add(E person){
        personList.add(person);
    }
    public void remove(E person){
        personList.remove(person);
    }
    public int size(){
       return personList.size();
    }
    public void clear(){
        personList.clear();
    }
    public E findById(long id){
        for(E person : personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }
    public E[] toArray(Student[] students) {
        E[] newArray = (E[]) Array.newInstance(personList.get(0).getClass(), personList.size());
        for (int i=0; i<personList.size(); i++) {
            newArray[i] = personList.get(i);
        }
        return newArray;
    }
    @Override
    public Iterator<E> iterator() {
        return personList.stream().iterator();
    }

}
