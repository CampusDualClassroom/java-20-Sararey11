package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    static List<Person> peopleList = new ArrayList<>();
    public static List<Person> getPeopleList() {
        if (peopleList.isEmpty()) {
            peopleList.add(new Person("Eduardo", "Martinez"));
            peopleList.add(new Teacher("Suso", "Otero", "Matematicas"));
            peopleList.add(new PoliceOfficer("Jose", "Boyle", "Sargento"));
            peopleList.add(new Doctor("Luis", "Trejos", "Cirujano"));
        }

        return peopleList;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person person : stringList) {
            person.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
