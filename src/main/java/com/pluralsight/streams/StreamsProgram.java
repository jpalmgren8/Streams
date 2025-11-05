package com.pluralsight.streams;

import com.pluralsight.traditional.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class StreamsProgram {
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



    }
}
