package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job test_job = new Job();
        Job test_job_two = new Job();
        assertNotEquals(test_job, test_job_two);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job_three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job_three.getName() instanceof String);
        assertTrue(test_job_three.getEmployer() instanceof Employer);
        assertTrue(test_job_three.getLocation() instanceof Location);
        assertTrue(test_job_three.getPositionType() instanceof PositionType);
        assertTrue(test_job_three.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", test_job_three.getName());
        assertEquals("ACME", test_job_three.getEmployer().getValue());
        assertEquals("Desert", test_job_three.getLocation().getValue());
        assertEquals("Quality control", test_job_three.getPositionType().getValue());
        assertEquals("Persistence", test_job_three.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job test_job_four = new Job("UX Designer", new Employer ("BJC"), new Location("Saint Louis"), new PositionType("full time"), new CoreCompetency("Design"));
        Job test_job_five = new Job("UX Designer", new Employer ("BJC"), new Location("Saint Louis"), new PositionType("full time"), new CoreCompetency("Design"));
        assertFalse(test_job_four.equals(test_job_five));
    }


//    @Test
//    public void  testToStringStartsAndEndsWithNewLine() {
//        Job test_job_six = new Job();
//        assertEquals(System.lineSeparator(), test_job_six.toString());
//    }
//
}
