package com.company;

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
        System.out.println ("Workout suggestion: " + log.whatKind(true, 7, false, false, false, 2, true));
    }
}
