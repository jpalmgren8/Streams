package com.pluralsight.traditional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Liam", "Carter", 27));
        people.add(new Person("Ava", "Mitchell", 34));
        people.add(new Person("Noah", "Ramirez", 22));
        people.add(new Person("Sophia", "Bennett", 29));
        people.add(new Person("Ethan", "Kim", 31));
        people.add(new Person("Olivia", "Hayes", 25));
        people.add(new Person("Mason", "Rivera", 40));
        people.add(new Person("Isabella", "Torres", 19));
        people.add(new Person("Lucas", "Green", 37));
        people.add(new Person("Amelia", "Brooks", 28));

        System.out.println("Enter a first or last name to search: ");
        String nameInput = sc.nextLine();

        List<Person> results = new ArrayList<>();

        for (Person person : people) {
            
            if (nameInput.equalsIgnoreCase(person.getFirstName())) {
                results.add(person);
            } else if (nameInput.equalsIgnoreCase(person.getLastName())) {
                results.add(person);
            }
        }

        for (int i = 0; i < results.size(); i++) {
            System.out.println("Person found: " + (i + 1) + ":");
            System.out.println(results.get(i));
        }

        int averageAge = 0;
        int oldestAge = -1;
        int youngestAge = 1000;

        for (Person person : people) {
            averageAge += person.getAge();

            if (person.getAge() > oldestAge) {
                oldestAge = person.getAge();
            }

            if (person.getAge() < youngestAge) {
                youngestAge = person.getAge();
            }
        }

        System.out.println("Average age of list of people: " + averageAge / people.size());
        System.out.println("Oldest age of list of people: " + oldestAge);
        System.out.println("Youngest age of list of people: " + youngestAge);

        sc.close();
    }
}
