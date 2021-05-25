package com.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyzerTest {

    @Test
    public void givenSadMessageShouldReturnSadMessage() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am in sad mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenHappyMassageShouldReturnHappyMessage(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am in happy mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenAnyMassageShouldReturnHappyMessage() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am not in mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenNullMassageShouldReturnHappyMessage(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY",mood);

    }
}
