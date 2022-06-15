package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        WorkoutLog log = new WorkoutLog();
        Workout w = new Workout(3, 1.5, "Trampolining");
        Workout a = new Workout(5, "Soccer practice", true, 2, 8.5, false);
        log.addWorkout(w);
        log.addIndexWorkout(a,0);
        System.out.println(log.shouldWorkout(false, false, 4));
        log.printNumberedLog();
        w.setDayOfWeek(2);
        w.printWorkout(w);

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Respond in true or false, are you injured?");
        boolean injury = scan.nextBoolean();
        System.out.println("What is the numbered day of the week? (Monday is 1)");
        int day = scan.nextInt();
        System.out.println("Are you in soccer season (true or false)?");
        boolean soccer = scan.nextBoolean();
        System.out.println("Are you in track season (true or false)?");
        boolean track = scan.nextBoolean();
        System.out.println("Did you already have practice today (true or false)?");
        boolean practice = scan.nextBoolean();
        System.out.println("How many hours do you have?");
        double hours = scan.nextDouble();
        System.out.println("Is it nice outside (true or false)?");
        boolean weather = scan.nextBoolean();

        System.out.println ("Workout suggestion: " + log.whatKind(injury, day, soccer, track, practice, hours, weather));
    }
}
