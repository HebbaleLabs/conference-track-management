import static com.talfinder.ctm.util.Constant.NEW_LINE;

import java.io.IOException;

import org.junit.Test;
import static org.junit.Assert.*;

import com.talfinder.ctm.Conference;
import com.talfinder.ctm.ConferenceScheduler;

public class ConferenceSchedulerTest {
	
	@Test
	public void testSchedule() {
		StringBuilder input = new StringBuilder();
		input.append("Writing Fast Tests Against Enterprise Rails 60min\n");
		input.append("Overdoing it in Python 60min\n");
		input.append("Lua for the Masses 60min\n");
		input.append("Ruby Errors from Mismatched Gem Versions 60min\n");
		input.append("Common Ruby Errors 60min\n");
		input.append("Rails for Python Developers 65min\n");
		
		StringBuilder expectedOutput = new StringBuilder();
		expectedOutput.append("Conference Schedule:" + NEW_LINE + NEW_LINE);
		expectedOutput.append("Track 1:" + NEW_LINE);
		expectedOutput.append("09:00 AM Writing Fast Tests Against Enterprise Rails - 60 min\n");
		expectedOutput.append("10:00 AM Overdoing it in Python - 60 min\n");
		expectedOutput.append("11:00 AM Lua for the Masses - 60 min\n");
		expectedOutput.append("12:00 PM Lunch - 60 min\n");
		expectedOutput.append("01:00 PM Ruby Errors from Mismatched Gem Versions - 60 min\n");
		expectedOutput.append("02:00 PM Common Ruby Errors - 60 min\n");
		expectedOutput.append("03:00 PM Rails for Python Developers - 65 min\n");
		expectedOutput.append("04:05 PM Networking Event - 60 min\n");
		
		try {
			Conference conference = new ConferenceScheduler().schedule(input);
			assertEquals(expectedOutput.toString(), conference.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSchedule2() {
		StringBuilder input = new StringBuilder();
		input.append("Writing Fast Tests Against Enterprise Rails 120min\n");
		input.append("Overdoing it in Python 60min\n");
		input.append("Lua for the Masses 120min\n");
		input.append("Ruby Errors from Mismatched Gem Versions 120min\n");
		
		StringBuilder expectedOutput = new StringBuilder();
		expectedOutput.append("Conference Schedule:" + NEW_LINE + NEW_LINE);
		expectedOutput.append("Track 1:" + NEW_LINE);
		expectedOutput.append("09:00 AM Writing Fast Tests Against Enterprise Rails - 120 min\n");
		expectedOutput.append("11:00 AM Overdoing it in Python - 60 min\n");
		expectedOutput.append("12:00 PM Lunch - 60 min\n");
		expectedOutput.append("01:00 PM Lua for the Masses - 120 min\n");
		expectedOutput.append("03:00 PM Ruby Errors from Mismatched Gem Versions - 120 min\n");
		expectedOutput.append("05:00 PM Networking Event - 60 min\n");
		
		try {
			Conference conference = new ConferenceScheduler().schedule(input);
			assertEquals(expectedOutput.toString(), conference.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSchedule3() {
		StringBuilder input = new StringBuilder();
		input.append("Writing Fast Tests Against Enterprise Rails 60min\n");
		input.append("Overdoing it in Python 45min\n");
		input.append("Lua for the Masses 30min\n");
		input.append("Ruby Errors from Mismatched Gem Versions 45min\n");
		input.append("Common Ruby Errors 45min\n");
		input.append("Rails for Python Developers lightning\n");
		input.append("Communicating Over Distance 60min\n");
		input.append("Accounting-Driven Development 45min\n");
		input.append("Woah 30min\n");
		input.append("Pair Programming vs Noise 45min\n");
		input.append("Rails Magic 60min\n");
		input.append("Ruby on Rails: Why We Should Move On 60min\n");
		input.append("Clojure Ate Scala (on my project) 45min\n");
		input.append("Programming in the Boondocks of Seattle 30min\n");
		input.append("Ruby vs. Clojure for Back-End Development 30min\n");
		input.append("Ruby on Rails Legacy App Maintenance 60min\n");
		input.append("A World Without HackerNews 30min\n");
		input.append("User Interface CSS in Rails Apps 30min\n");
		input.append("Sit Down and Write 30min\n");
		
		StringBuilder expectedOutput = new StringBuilder();
		expectedOutput.append("Conference Schedule:" + NEW_LINE + NEW_LINE);
		expectedOutput.append("Track 1:" + NEW_LINE);
		expectedOutput.append("09:00 AM Writing Fast Tests Against Enterprise Rails - 60 min\n");
		expectedOutput.append("10:00 AM Overdoing it in Python - 45 min\n");
		expectedOutput.append("10:45 AM Lua for the Masses - 30 min\n");
		expectedOutput.append("11:15 AM Ruby Errors from Mismatched Gem Versions - 45 min\n");
		expectedOutput.append("12:00 PM Lunch - 60 min\n");
		expectedOutput.append("01:00 PM Common Ruby Errors - 45 min\n");
		expectedOutput.append("01:45 PM Rails for Python Developers - 1 lightning\n");
		expectedOutput.append("01:50 PM Communicating Over Distance - 60 min\n");
		expectedOutput.append("02:50 PM Accounting-Driven Development - 45 min\n");
		expectedOutput.append("03:35 PM Woah - 30 min\n");
		expectedOutput.append("04:05 PM Pair Programming vs Noise - 45 min\n");
		expectedOutput.append("04:50 PM Networking Event - 60 min\n\n");
		expectedOutput.append("Track 2:" + NEW_LINE);
		expectedOutput.append("09:00 AM Rails Magic - 60 min\n");
		expectedOutput.append("10:00 AM Ruby on Rails: Why We Should Move On - 60 min\n");
		expectedOutput.append("11:00 AM Clojure Ate Scala (on my project) - 45 min\n");
		expectedOutput.append("12:00 PM Lunch - 60 min\n");
		expectedOutput.append("01:00 PM Programming in the Boondocks of Seattle - 30 min\n");
		expectedOutput.append("01:30 PM Ruby vs. Clojure for Back-End Development - 30 min\n");
		expectedOutput.append("02:00 PM Ruby on Rails Legacy App Maintenance - 60 min\n");
		expectedOutput.append("03:00 PM A World Without HackerNews - 30 min\n");
		expectedOutput.append("03:30 PM User Interface CSS in Rails Apps - 30 min\n");
		expectedOutput.append("04:00 PM Sit Down and Write - 30 min\n");
		expectedOutput.append("04:30 PM Networking Event - 60 min\n");
		
		try {
			Conference conference = new ConferenceScheduler().schedule(input);
			assertEquals(expectedOutput.toString(), conference.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSchedule4() {
		StringBuilder input = new StringBuilder();
		input.append("Sit Down and Write 120min\n");
		input.append("User Interface CSS in Rails Apps 60min\n");
		input.append("Ruby vs. Clojure for Back-End Development 120min\n");
		input.append("A World Without HackerNews 120min\n");
		
		StringBuilder expectedOutput = new StringBuilder();
		expectedOutput.append("Conference Schedule:" + NEW_LINE + NEW_LINE);
		expectedOutput.append("Track 1:" + NEW_LINE);
		expectedOutput.append("09:00 AM Sit Down and Write - 120 min\n");
		expectedOutput.append("11:00 AM User Interface CSS in Rails Apps - 60 min\n");
		expectedOutput.append("12:00 PM Lunch - 60 min\n");
		expectedOutput.append("01:00 PM Ruby vs. Clojure for Back-End Development - 120 min\n");
		expectedOutput.append("03:00 PM A World Without HackerNews - 120 min\n");
		expectedOutput.append("05:05 PM Networking Event - 60 min\n");
		
		try {
			Conference conference = new ConferenceScheduler().schedule(input);
			assertEquals(expectedOutput.toString(), conference.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
