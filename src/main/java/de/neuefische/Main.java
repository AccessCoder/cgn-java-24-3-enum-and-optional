package de.neuefische;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
//        Weekday today = Weekday.FRIDAY;
//        System.out.println(today.getWeekdayNormal());
//        System.out.println(today.getDayNum());

        //Optional
        Doctors doctors = new Doctors();

        doctors.addDoc(new Doctor("1", "Müller"));
        doctors.addDoc(new Doctor("2", "Baummann"));

        printDoctorsName(doctors.findDoc("3")); //  [null]

    }

    public static void printDoctorsName(Optional<Doctor> optionalDoctor){
        if (optionalDoctor.isPresent()){
            System.out.println(optionalDoctor.get().getName());
        }else {
            System.out.println("Doctor not Found!");
        }
    }
}