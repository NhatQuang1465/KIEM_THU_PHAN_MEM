package com.example.student;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

class StudentAnalyzerTest {

    @Test
    void testCountExcellentStudents() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.0, 10.0, 7.5)));
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(0.0, 10.0, 0.0)));
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-5.0, 12.0)));
    }

    @Test
    void testCalculateValidAverage() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
        assertEquals(8.625, analyzer.calculateValidAverage(Arrays.asList(8.0, 9.0, 10.0, 7.5)), 0.01);
        assertEquals(0, analyzer.calculateValidAverage(Collections.emptyList()), 0.01);
        assertEquals(2.85, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0, 0.0, 0.0, 0.0, 0.0, 10.0)), 0.01);
        assertEquals(0, analyzer.calculateValidAverage(Arrays.asList(-5.0, 12.0)), 0.01);
    }
    @Test
void testValidNonExcellent() {
    StudentAnalyzer analyzer = new StudentAnalyzer();
    assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(5.0, 6.5, 7.9)));
}
@Test
void testAllExcellent() {
    StudentAnalyzer analyzer = new StudentAnalyzer();
    assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.0, 10.0)));
}

@Test
void testUpperRobustBoundary() {
    StudentAnalyzer analyzer = new StudentAnalyzer();
    assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(10.0, 10.1)));
}

@Test
void testLowerRobustBoundary() {
    StudentAnalyzer analyzer = new StudentAnalyzer();
    assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-0.1, 0.0)));
}

}
