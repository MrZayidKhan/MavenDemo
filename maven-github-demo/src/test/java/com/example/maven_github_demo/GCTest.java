package com.example.maven_github_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class GCTest {
@Test
void testTotal()
{
	assertEquals(225, GradeCalculator.calculateTotal(75, 68, 82));
}
@Test
void testAverage()
{
	assertEquals(75.0,GradeCalculator.calculateAverage(75,68,82));
}
@Test
void testPass()
{
	assertTrue(GradeCalculator.isPass(75.0));
}
@Test
void testFail()
{
	assertFalse(GradeCalculator.isPass(35.0));
}
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
