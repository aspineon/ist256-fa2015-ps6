/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradesTests;

import Grades.GradeProcessor;
import Grades.LetterGrade;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mafudge
 */
public class GradeProcessorTests {
    
    public GradeProcessorTests() {
    }


    @Test //expectng a grade count of 3 when there's 3 grades
    public void Test_Count_Expect3_WhenThereAre3Grades() {
        //arrange
        int expected = 3;
        ArrayList<LetterGrade> grades = new ArrayList();
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.B);
        grades.add(LetterGrade.C);
        GradeProcessor gp = new GradeProcessor(grades);
        //act
        int actual = gp.Count();
        //assert
        assertEquals(expected,actual);
    }
    
    @Test //expectng a grade count of 0 when there are no grades
    public void Test_Count_Expect0_WhenThereAreNoGrades() {
        //arrange
        int expected = 0;
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        //act
        int actual = gp.Count();
        //assert
        assertEquals(expected,actual);
    }
    
    @Test
    public void Test_GPA_Expect3dot0_WhenGradesAre_A_BMinus_BPlus_C() {
        //arrange
        double expected = 3.0;
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.BMinus);
        grades.add(LetterGrade.BPlus);
        grades.add(LetterGrade.C);
        //act
        double actual = gp.GPA();
        //assert
        assertEquals(expected,actual,0);        
    }
    
    @Test
    public void Test_GPA_Expect0_WhenGradesAre_Empty() {
        //arrange
        double expected = 0;
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        //act
        double actual = gp.GPA();
        //assert
        assertEquals(expected,actual,0);        
    }
    
    @Test
    public void Test_Highest_Expect_A_WhenHighestAtEnd_GradesAre_F_C_A() {
        //arrange
        String expected = "A";
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.F);
        grades.add(LetterGrade.C);
        grades.add(LetterGrade.A);
        //act
        String actual = gp.Highest().Letter();
        //assert
        assertEquals(expected,actual);                
    }

        @Test
    public void Test_Highest_Expect_A_WhenHighestAtBeginning_GradesAre_A_F_C() {
        //arrange
        String expected = "A";
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.F);
        grades.add(LetterGrade.C);
        //act
        String actual = gp.Highest().Letter();
        //assert
        assertEquals(expected,actual);                
    }
    
        @Test
    public void Test_Highest_Expect_A_WhenHighestInMiddle_GradesAre_F_A_C() {
        //arrange
        String expected = "A";
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.F);
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.C);
        //act
        String actual = gp.Highest().Letter();
        //assert
        assertEquals(expected,actual);                
    }
    
    @Test
    public void Test_Lowest_Expect_F_WhenLowestIsFirst_GradesAre_F_A_C() {
        //arrange
        String expected = "F";
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.F);
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.C);
        //act
        String actual = gp.Lowest().Letter();
        //assert
        assertEquals(expected,actual);                
    }

        @Test
    public void Test_Lowest_Expect_F_WhenLowestIsLast_GradesAre_A_C_F() {
        //arrange
        String expected = "F";
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.C);
        grades.add(LetterGrade.F);
        //act
        String actual = gp.Lowest().Letter();
        //assert
        assertEquals(expected,actual);                
    }

        @Test
    public void Test_Lowest_Expect_F_WhenLowestInMiddle_GradesAre_A_F_C() {
        //arrange
        String expected = "F";
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.F);
        grades.add(LetterGrade.C);
        //act
        String actual = gp.Lowest().Letter();
        //assert
        assertEquals(expected,actual);                
    }
        
    @Test
    public void Test_Mean_Expect_BPlus_WhenGradesAre_A_BPlus_B() {
        //arrange
        LetterGrade expected = LetterGrade.BPlus;
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.BPlus);
        grades.add(LetterGrade.B);
        //act
        LetterGrade actual = gp.Mean();
        //assert
        assertEquals(expected.Letter(),actual.Letter());        
    }

    @Test
    public void Test_Mean_Expect_B_WhenGradesAre_A_BMinus_BPlus_C() {
        //arrange
        LetterGrade expected = LetterGrade.B;
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.BPlus);
        grades.add(LetterGrade.BMinus);
        grades.add(LetterGrade.B);
        //act
        LetterGrade actual = gp.Mean();
        //assert
        assertEquals(expected.Letter(),actual.Letter());        
    }

    
    @Test
    public void Test_Mean_Expect_Cminus_WhenGradesAre_A_D_C_F() {
        //arrange
        LetterGrade expected = LetterGrade.CMinus;
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.D);
        grades.add(LetterGrade.C);
        grades.add(LetterGrade.F);
        //act
        LetterGrade actual = gp.Mean();
        //assert
        assertEquals(expected.Letter(),actual.Letter());        
    }

    @Test 
    public void Test_Frequency_Expect_0_When_Grade_Is_F_And_Grades_are_A_B_C_B() {
        //arrange
        int expected = 0;
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.B);
        grades.add(LetterGrade.C);
        grades.add(LetterGrade.B);
        //act
        int actual = gp.Frequency(LetterGrade.F);
        //assert
        assertEquals(expected, actual);
    }
    
    @Test 
    public void Test_Frequency_Expect_2_When_Grade_Is_B_And_Grades_are_A_B_C_B() {
        //arrange
        int expected = 2;
        ArrayList<LetterGrade> grades = new ArrayList();
        GradeProcessor gp = new GradeProcessor(grades);
        grades.add(LetterGrade.A);
        grades.add(LetterGrade.B);
        grades.add(LetterGrade.C);
        grades.add(LetterGrade.B);
        //act
        int actual = gp.Frequency(LetterGrade.B);
        //assert
        assertEquals(expected, actual);
    }
    
}
