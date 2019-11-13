package com.example.comedian;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Comedian {

    private Random randomGenerator = new Random();
    private static List<String> jokes = new ArrayList<>();
    static {
        jokes.add("The past, present, and future walked into a bar. It was tense.");
        jokes.add("What’s the difference between a cat and a comma? One has claws at the end of its paws, and the other is a pause at the end of a clause.");
        jokes.add("Did you hear the one about the pregnant woman who went into labor and started shouting: Couldn’t! Wouldn’t! Shouldn’t! Didn’t! Can’t! She was having contractions.");
        jokes.add("Which dinosaur knows the most words? A Thesaurus");
        jokes.add("Why did Shakespeare only write in ink? Pencils confused him — 2B or not 2B?");
        jokes.add("I invented a new word! Plagiarism.");
        jokes.add("Never leave alphabet soup on the stove and then go out. It could spell disaster.");
        jokes.add("When I was young there was only 25 letters in the Alphabet? Nobody knew why.");
        jokes.add("Which word becomes shorter after you add two letters to it? Short");
        jokes.add("What should you say to comfort a grammar nazi? There, their, they’re.");
        jokes.add("When I was a kid, my teacher looked my way and said: Name two pronouns. I said: Who, me?");
        jokes.add("Write a wise saying and your name will live forever. —Anonymous.");
    }

    public String amuseMe() {
        return jokes.get(randomGenerator.nextInt(jokes.size()));
    }
}
