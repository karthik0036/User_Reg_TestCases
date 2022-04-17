package com.bridge;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzer_Test {

    MoodAnalyzer mood = new MoodAnalyzer();

    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        String result = mood.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", result);
    }

    @Test
    public void givenMessage_WhenNotProper_ShouldReturnEntryFailed() {
        String result = mood.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", result);
    }
}
