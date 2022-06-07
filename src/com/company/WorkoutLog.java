package com.company;

import java.util.ArrayList;

public class WorkoutLog {
    // instance variables for whatever I can come up with to make it useful
    public static ArrayList <Workout> log = new ArrayList<>();
    public String name;

    // a bunch of constructors; empty, with a name (don't know why), with one workout
    public WorkoutLog()
    {

    }

    public WorkoutLog(String name)
    {
        this.name = name;
    }

    public WorkoutLog(Workout w)
    {
        log.add(w);
    }

    // print the entire arrayList with no numbers
    public void printLog ()
    {
        System.out.println(log);
    }

    // print the arrayList with numbers
    public void printNumberedLog ()
    {
        for (int i = 0; i < log.size(); i ++)
        {
            System.out.println(i+1 + ": " + log.get(i));
        }
    }

    // return workout details from a specific point in the log
    public Workout viewWorkout (int index)
    {
        return log.get(index);
    }
    // just adding workouts to the program
    public void addWorkout(Workout w)
    {
        log.add(w);
    }
    // adding a workout based on whatever point in the log the user wants
    public void addIndexWorkout(Workout w, int index)
    {
        log.add(index, w);
    }
    // same thing as adding but removing
    public void removeWorkout(Workout w)
    {
        log.remove(w);
    }

    public void removeWorkout(int index)
    {
        log.remove(index);
    }

    // getters and setters

    public String getName() {
        return name;
    }
    public ArrayList<Workout> getLog() {
            return log;
        }
    public void setName (String name)
    {
        this.name = name;
    }

    public int getSize() { return log.size(); }

    public String whatKind (boolean isInjured, int weekDay, boolean inSoccer, boolean inTrack, boolean hadPractice, double hoursGiven, boolean niceWeather)
    {
        //return some light workouts to do in relation to the sports season I'm in, injuries, and general energy levels.
        if (inSoccer || inTrack)
        {
            if (isInjured)
            {
                return "Don't workout, eat some strawberries, watch Netflix, and rest up.";
            }
            else if (hadPractice)
            {
                return "Maybe a light trampolining or some yoga to stretch out, don't overdo it.";
            }
            else if (weekDay == 7)
            {
                return "Take a rest day, avoid injury, walk The Beckanator.";
            }
            else if (inSoccer)
            {
                return "Juggle, do footwork, and run hill sprints.";
            }
            return "Go for a 5k jog.";
        }
        // In off-seasons you can be a bit less careful, so injuries don't hinder exersize as much
        else if (isInjured)
        {
            if (hoursGiven <= 0.5)
            {
                return "Favorite lower abs workout, arm workout, 10 reps on the ab wheel.";
            }
            else if (weekDay == 6 || weekDay == 7 && niceWeather)
            {
                return "Take Advil and go walk the dogs with Liv";
            }
            else if (weekDay == 6 || weekDay == 7 && !niceWeather)
            {
                return "Ab workouts in solarium, juggle around and take breaks.";
            }
            return "Trampoline until it hurts, then go inside and ice.";
        }
        // not a ton of time, just casual workouts
        else if (hoursGiven < 1)
        {
            if (niceWeather)
            {
                return "Go for a 5k run, juggle for whatever time is left.";
            }
            return "HIIT workout, arms and abs workout video, 10 reps ab wheel.";
        }
        // Decent amount of time to pack in a lot of strength training
        else if (hoursGiven < 2)
        {
            if (niceWeather)
            {
                return "5k-8k run, trampoline with hype music for rest of time.";
            }
            return "25 min HIIT workout, two 10 min abs workouts, one arm workout, ab wheel until you die, lay on the floor in defeat and pain.";
        }
        // Ideal amount of time when I'm definitely going to get tired
        else
        {
            if (niceWeather)
            {
                return "Dutch braid hair and trampoline until you die, juggle in the shade when it's too hot.";
            }
            return "25 min HIIT workout, two 10 min abs workouts, one arm workout, ab wheel until you die, lay on the floor in defeat and pain.";
        }
    }

    // just returns whether it's a good idea to work out based on variables (in my opinion)
    public boolean shouldWorkout (boolean inSeason, boolean isInjured, int dayOfWeek)
    {
        if (dayOfWeek == 7)
        {
            return !inSeason || !isInjured;
        }
        else if (isInjured)
        {
            return !inSeason;
        }

        else if (inSeason)
        {
            return !isInjured;
        }
        return true;
    }







}
