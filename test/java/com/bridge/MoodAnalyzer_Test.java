package com.bridge;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzer_Test {

    MoodAnalyzer mood = new MoodAnalyzer();

    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        try {
            String result = mood.analyseMood("User is Happy");
            Assert.assertEquals("Entry Successful", result);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_WhenNotProper_ShouldReturnEntryFailed() {
        try {
            String result = mood.analyseMood("User is Sad");
            Assert.assertEquals("Entry Failed", result);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMessage_NULL_ShouldReturnMoodAnalyserException() throws MoodAnalyzerException {

        try {
            mood.analyseMood(null);
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.type.NULL, e.type);
        }
    }

    @Test
    public void givenMessage_EMPTY_ShouldReturnMoodAnalyserException() throws MoodAnalyzerException {

        try {
            mood.analyseMood("");
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.type.EMPTY, e.type);
        }
    }
}
