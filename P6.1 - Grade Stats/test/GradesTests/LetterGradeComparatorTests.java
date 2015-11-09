/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradesTests;

import Grades.LetterGrade;
import Grades.LetterGradeComparator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mafudge
 */
public class LetterGradeComparatorTests {
    
    public LetterGradeComparatorTests() {
    }

     @Test
     public void Test_compare_Expect_True_When_grade1GreaterThan_grade2_Returns_PositiveResult() {
         //arrange
         boolean expected = true;
         //act
         LetterGradeComparator c = new LetterGradeComparator();
         int result = c.compare(LetterGrade.A, LetterGrade.B);
         boolean actual = result > 0;
         //assert
         assertEquals(expected,actual);
     }
     
     @Test
     public void Test_compare_Expect_True_When_grade1LessThan_grade2_Returns_NegativeResult() {
         //arrange
         boolean expected = true;
         //act
         LetterGradeComparator c = new LetterGradeComparator();
         int result = c.compare(LetterGrade.F, LetterGrade.C);
         boolean actual = result < 0;
         //assert
         assertEquals(expected,actual);
     }

     @Test
     public void Test_compare_Expect_True_When_grade1EqualTo_grade2_Returns_Zero() {
         //arrange
         boolean expected = true;
         //act
         LetterGradeComparator c = new LetterGradeComparator();
         int result = c.compare(LetterGrade.CMinus, LetterGrade.CMinus);
         boolean actual = result == 0;
         //assert
         assertEquals(expected,actual);
     }

     

}
