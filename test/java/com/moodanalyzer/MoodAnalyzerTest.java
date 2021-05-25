package com.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
    @Test
    public void givenSadMessage() {
        String mood = moodAnalyzer.analyzeMood("Hello am in sad mood");
        Assertions.assertEquals("SAD", mood);
    }
    public void givenHappyMassage(){
        String mood = moodAnalyzer.analyzeMood("Hello am in happy mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}
