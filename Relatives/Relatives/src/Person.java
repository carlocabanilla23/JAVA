// This class can be used to store the family information for one person

import java.util.*;

public class Person {
    private String name;
    private Person mother;
    private Person father;
    private ArrayList<Person> kids;

    // post: person with given name is constructed */
    public Person(String person) {
        name = person;
        mother = null;
        father = null;
        kids = new ArrayList<Person>();
    }

    // post : returns the name of the person
    public String getName() {
        return name;
    }

    // post : returns a reference to the mother of the person
    public Person getMother() {
        return mother;
    }

    // post : returns a reference to the father of the person
    public Person getFather() {
        return father;
    }

    // post : returns the number of children of the person
    public int numKids() {
        return kids.size();
    }

    // pre : 0 <= n < numKids
    // post: returns the nth child of this person (n = 0, 1, 2, 3, ...)
    public Person nthKid(int n) {
        return kids.get(n);
    }

    // post: sets the mother of this person
    public void setMother(Person mother) {
        this.mother = mother;
    }

    // post: sets the father of this person
    public void setFather(Person father) {
        this.father = father;
    }

    // post: adds the given kid as a child of this person
    public void addKid(Person kid) {
        kids.add(kid);
    }
}
