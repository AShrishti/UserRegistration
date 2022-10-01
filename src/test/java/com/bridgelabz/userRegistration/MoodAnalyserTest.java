package com.bridgelabz.userRegistration;

import static org.junit.Assert.assertEquals;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void TestMoodAnalysis() throws Exception{
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String Mood =moodAnalyser.analyseMood("I am in  SAD Mood");
		Assert.assertThat(Mood, CoreMatchers.is("SAD"));
		assertEquals("SAD", Mood);
	}
	
	@Test
	public void TestMoodAnalysisSecond() throws Exception{
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String Mood =moodAnalyser.analyseMood("SAD");
		Assert.assertThat(Mood, CoreMatchers.is("HAPPY"));
	}
	
	@Test
	public void TestMoodAnalysisThird() throws Exception{
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String Mood =moodAnalyser.analyseMood(null);
		Assert.assertThat(Mood, CoreMatchers.is("SAD"));
	}
	@Test
	public void TestMoodAnalysisFourth() throws Exception{
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String Mood =moodAnalyser.analyseMood("HAPPY");
		Assert.assertThat(Mood, CoreMatchers.is("HAPPY"));
	}
}
