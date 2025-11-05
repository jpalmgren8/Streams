package com.pluralsight.streams;

import com.pluralsight.traditional.Person;

import java.util.*;

public class StreamsProgram {
    public static void main(String[] args) throws InterruptedException {

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


        List<Person> results = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(nameInput) || person.getLastName().equalsIgnoreCase(nameInput))
                .toList();

        results.stream().forEach(System.out::println);

        System.out.println();
        System.out.println("Would you like to see age info on person list?");
        System.out.println("Proceed - 1");
        System.out.println("Exit - 2");
        System.out.println("Enter a number: ");
        int numInput = sc.nextInt();
        sc.nextLine();

        switch (numInput) {
            case 1:
                double averageAge = people.stream()
                        .mapToInt(Person::getAge)
                        .average()
                        .orElse(0.0);

                int oldestAge = people.stream()
                        .mapToInt(Person::getAge)
                        .max()
                        .orElse(0);

                int youngestAge = people.stream()
                        .mapToInt(Person::getAge)
                        .min()
                        .orElse(0);

                System.out.println("=======[List of People: Age Info]=======");
                System.out.println("Average age of list of people: " + averageAge);
                System.out.println("Oldest age of list of people: " + oldestAge);
                System.out.println("Youngest age of list of people: " + youngestAge);

                sc.close();

                break;
            case 2:
                System.out.println("Closing program...");
                Thread.sleep(2000);
                sc.close();
                System.exit(0);
                break;
        }
    }
}
