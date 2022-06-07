package com.company;

public class Workout {
    // crapload of instance variables since the workout log itself is gonna be pretty boring
    public double duration;
    public boolean injury;
    public int dayOfWeek;
    public int hourOfDay;
    public String type;
    public boolean withOthers;
    public double difficultyRating;

    // a bunch of constructors because sometimes I'm too lazy to give info and sometimes I'm neurotic
    public Workout (int weekDay)
    {
        dayOfWeek = weekDay;
    }

    public Workout (String type, int weekDay) {
        this.type = type;
        dayOfWeek = weekDay;
    }
    // some variables matter more, like the day of the week and the duration/type of workout
    public Workout (int weekDay, double hours, int time)
    {
        hourOfDay = time;
        duration = hours;
        dayOfWeek = weekDay;
    }
    // probably the most basic level of useful information to input if I wanted to know what I did one day
    public Workout (int weekDay, double hours, String description)
    {
        dayOfWeek = weekDay;
        duration = hours;
        type = description;
    }
    // if I workout with friends, the time of day doesn't matter, that's a more individual variable that changes
    public Workout (int weekDay, boolean groupWorkout, double hours, double howHard)
    {
        dayOfWeek = weekDay;
        withOthers = groupWorkout;
        duration = hours;
        difficultyRating = howHard;
    }

    public Workout (int weekDay, boolean isInjured, double howHard, int time)
    {
        dayOfWeek = weekDay;
        injury = isInjured;
        difficultyRating = howHard;
        hourOfDay = time;
    }
    // another large amount of info for this Workout input
    public Workout (int weekDay, String description, boolean groupWorkout, double hours, double howHard, boolean isInjured)
    {
        dayOfWeek = weekDay;
        type = description;
        withOthers = groupWorkout;
        duration = hours;
        difficultyRating = howHard;
        injury = isInjured;
    }

    // my neurotic option with an absurd amount of info
    public Workout (int weekDay, double hours, boolean isInjured, int time, boolean groupWorkout, double rating, String description)
    {
        duration = hours;
        dayOfWeek = weekDay;
        injury = isInjured;
        hourOfDay = time;
        type = description;
        withOthers = groupWorkout;
        difficultyRating = rating;
    }
    //print out a workout
    public void printWorkout(Workout w)
    {
        System.out.println(w);
    }

    // getters and setters for literally all of it
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isInjury() {
        return injury;
    }

    public void setInjury(boolean injury) {
        this.injury = injury;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(int hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isWithOthers() {
        return withOthers;
    }

    public void setWithOthers(boolean withOthers) {
        this.withOthers = withOthers;
    }

    public double getDifficultyRating() {
        return difficultyRating;
    }

    public void setDifficultyRating(double difficultyRating) {
        this.difficultyRating = difficultyRating;
    }
    //toString method for when I print the workouts
    @Override
    public String toString() {
        return "Workout{" +
                "duration=" + duration +
                ", injury=" + injury +
                ", dayOfWeek=" + dayOfWeek +
                ", hourOfDay=" + hourOfDay +
                ", type='" + type + '\'' +
                ", withOthers=" + withOthers +
                ", difficultyRating=" + difficultyRating +
                '}';
    }
}
