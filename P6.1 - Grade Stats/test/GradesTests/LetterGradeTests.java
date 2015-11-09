/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradesTests;

import Grades.LetterGrade;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mafudge
 */
public class LetterGradeTests {
    
    public LetterGradeTests() {
    }

    @Test // expect the string "B-" when GradeEnum.BMinus
    public void Test_Letter_Expect_StringBMinus_When_BMinus()
    {
        //arrange
        String expected = "B-";
        //act
        String actual = LetterGrade.BMinus.Letter();
        //assert
        assertEquals(expected, actual);
    }
    
    @Test // expect a points of 3.667 when GradeEnum.AMinus
    public void Test_Points_Expect_DoubleAMinus_When_AMinus() {
        //arrange
        double expected = 3.667;
        //act
        double actual = LetterGrade.AMinus.Points();
        //assert
        assertEquals(expected, actual, 0);
    }
}
