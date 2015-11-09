package GradesTests;

import java.io.FileNotFoundException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * All the tests in one convenient package for grading by me!
 * @author mafudge
 */
public class AllTests {
    
    private GradeFileLoaderTests gradeFileLoaderTests;
    private GradeProcessorTests gradeProcessorTests;
    private LetterGradeComparatorTests letterGradeComparatorTests;
    private LetterGradeTests letterGradeTests;
    
    public AllTests() {
        this.gradeFileLoaderTests = new GradeFileLoaderTests();
        this.gradeProcessorTests = new GradeProcessorTests();
        this.letterGradeComparatorTests = new LetterGradeComparatorTests();
        this.letterGradeTests = new LetterGradeTests();                
    }

    //////////////////// GradeFileLoader ////////////////////////////////////////
    @Test
     public void Test_GradeFileLoader_Load_ExpectCount10_WhenLoadGradesTestFile() throws FileNotFoundException {
         this.gradeFileLoaderTests.Test_Load_ExpectCount10_WhenLoadGradesTestFile();
     }
     
     /////////////////// LetterGradeComparator /////////////////////////////////
     @Test 
     public void Test_LetterGradeComparator_compare_Expect_True_When_grade1EqualTo_grade2_Returns_Zero() {
         this.letterGradeComparatorTests.Test_compare_Expect_True_When_grade1EqualTo_grade2_Returns_Zero();
     }
     @Test 
     public void Test_LetterGradeComparator_compare_Expect_True_When_grade1GreaterThan_grade2_Returns_PositiveResult() {
         this.letterGradeComparatorTests.Test_compare_Expect_True_When_grade1GreaterThan_grade2_Returns_PositiveResult();
     }
     @Test 
     public void Test_LetterGradeComparator_compare_Expect_True_When_grade1LessThan_grade2_Returns_NegativeResult() {
         this.letterGradeComparatorTests.Test_compare_Expect_True_When_grade1LessThan_grade2_Returns_NegativeResult();
     }
     
     /////////////////// LetterGrade ///////////////////////////////////////////
     @Test 
     public void Test_LetterGrade_Letter_Expect_StringBMinus_When_BMinus() {
         this.letterGradeTests.Test_Letter_Expect_StringBMinus_When_BMinus();
     }
    
     @Test 
     public void Test_LetterGrade_Points_Expect_DoubleAMinus_When_AMinus() {
         this.letterGradeTests.Test_Points_Expect_DoubleAMinus_When_AMinus();         
     }
     
     /////////////////// GradeProcessor ////////////////////////////////////////
     @Test 
     public void Test_GradeProcessor_Count_Expect0_WhenThereAreNoGrades() {
         this.gradeProcessorTests.Test_Count_Expect0_WhenThereAreNoGrades();
     }
     @Test
     public void Test_GradeProcessor_Count_Expect3_WhenThereAre3Grades() {
         this.gradeProcessorTests.Test_Count_Expect3_WhenThereAre3Grades();
     }
     @Test
     public void Test_GradeProcessor_Mean_Expect_B_WhenGradesAre_A_BMinus_BPlus_C() {
         this.gradeProcessorTests.Test_Mean_Expect_B_WhenGradesAre_A_BMinus_BPlus_C();
     }

     @Test
     public void Test_GradeProcessor_Mean_Expect_BPlus_WhenGradesAre_A_BPlus_B() {
         this.gradeProcessorTests.Test_Mean_Expect_BPlus_WhenGradesAre_A_BPlus_B();
     }

    @Test
     public void Test_GradeProcessor_Mean_Expect_Cminus_WhenGradesAre_A_D_C_F() {
         this.gradeProcessorTests.Test_Mean_Expect_Cminus_WhenGradesAre_A_D_C_F();
     }
     
     @Test
     public void Test_GradeProcessor_GPA_Expect0_WhenGradesAre_Empty() {
         this.gradeProcessorTests.Test_GPA_Expect0_WhenGradesAre_Empty();
     }
     @Test
     public void Test_GradeProcessor_GPA_Expect3dot0_WhenGradesAre_A_BMinus_BPlus_C() {
         this.gradeProcessorTests.Test_GPA_Expect3dot0_WhenGradesAre_A_BMinus_BPlus_C();
     }
     @Test
     public void Test_GradeProcessor_Highest_Expect_A_WhenHighestAtBeginning_GradesAre_A_F_C() {
         this.gradeProcessorTests.Test_Highest_Expect_A_WhenHighestAtBeginning_GradesAre_A_F_C();
     }
     @Test
     public void Test_GradeProcessor_Highest_Expect_A_WhenHighestAtEnd_GradesAre_F_C_A() {
         this.gradeProcessorTests.Test_Highest_Expect_A_WhenHighestAtEnd_GradesAre_F_C_A();
     }
     @Test
     public void Test_GradeProcessor_Highest_Expect_A_WhenHighestInMiddle_GradesAre_F_A_C() {
         this.gradeProcessorTests.Test_Highest_Expect_A_WhenHighestInMiddle_GradesAre_F_A_C();
     }
     @Test
     public void Test_GradeProcessor_Lowest_Expect_F_WhenLowestInMiddle_GradesAre_A_F_C() {
         this.gradeProcessorTests.Test_Lowest_Expect_F_WhenLowestInMiddle_GradesAre_A_F_C();
     }
     @Test
     public void Test_GradeProcessor_Lowest_Expect_F_WhenLowestIsFirst_GradesAre_F_A_C() {
         this.gradeProcessorTests.Test_Lowest_Expect_F_WhenLowestIsFirst_GradesAre_F_A_C();
     }
     @Test
     public void Test_GradeProcessor_Lowest_Expect_F_WhenLowestIsLast_GradesAre_A_C_F() {
         this.gradeProcessorTests.Test_Lowest_Expect_F_WhenLowestIsLast_GradesAre_A_C_F();
     }
     
    @Test 
    public void Test_GradeProcessor_Frequency_Expect_0_When_Grade_Is_F_And_Grades_are_A_B_C_B() {
        this.gradeProcessorTests.Test_Frequency_Expect_0_When_Grade_Is_F_And_Grades_are_A_B_C_B();
    }
    
    @Test 
    public void Test_GradeProcessor_Frequency_Expect_2_When_Grade_Is_B_And_Grades_are_A_B_C_B() {
        this.gradeProcessorTests.Test_Frequency_Expect_2_When_Grade_Is_B_And_Grades_are_A_B_C_B();
    }

}
