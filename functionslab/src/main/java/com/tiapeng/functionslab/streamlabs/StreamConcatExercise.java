package com.tiapeng.functionslab.streamlabs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

class Card {
    Person owner;
    String id;
    long balance;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Card(Person p, String id, long balance) {
        this.owner = p;
        this.id = id;
        this.balance = balance;
    }
}
class Person {
    String name;
    int age;
    List<Card> cards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Card> getCards() {
        if(cards == null) {
            return new ArrayList<>();
        }
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


}

public class StreamConcatExercise {
    public static void main(String... args) throws Exception {
        Person personA = new Person("Alice", 20);
        Person personB = new Person("Bob", 20);
        Person personC = new Person("Cecelia", 20);
        Person personD = new Person("David", 21);
        List<Person> personList1 = new LinkedList<>();
        personList1.add(personA);
        List<Person> personList2 = new LinkedList<>();
        personList2.add(personB);
        personList2.add(personC);
        personList2.add(personD);

        for(int i = 0; i<3; i++) {
            Card card = new Card(personA, String.valueOf(i), i * 1000);
            personA.getCards().add(card);
        }

        for(int i = 0; i<2; i++) {
            Card card = new Card(personB, String.valueOf(i), i * 2000);
            personB.getCards().add(card);
        }

        boolean test = personList1.stream().allMatch(e -> !(e.getAge() < 19));
        System.out.println(test);
        /*Stream cardsStream1 = null;
        if (personList1 != null && personList1.size() > 0) {
            cardsStream1 = personList1.stream().map(Person::getCards).flatMap(List::stream);

        }

        if (personList2 != null && personList2.size() > 0) {
            cardsStream1 = Stream.concat(cardsStream1, personList2.stream().map(Person::getCards).flatMap(List::stream));
        }*/
        //Stream.concat(personList1.stream().map(Person::getCards).flatMap(List::stream),
        //        personList2.stream().map(Person::getCards).flatMap(List::stream));


    }
}
