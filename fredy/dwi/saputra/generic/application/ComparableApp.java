package fredy.dwi.saputra.generic.application;

import fredy.dwi.saputra.generic.util.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("John", "Maluku"),
                new Person("Kei", "Maluku"),
                new Person("Master", "Maluku")
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
