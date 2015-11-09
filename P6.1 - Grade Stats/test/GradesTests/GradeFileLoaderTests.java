/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradesTests;

import Grades.GradeFileLoader;
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
public class GradeFileLoaderTests {
    
    public GradeFileLoaderTests() {
    }

     @Test
     public void Test_Load_ExpectCount10_WhenLoadGradesTestFile() throws FileNotFoundException {
         //arrange
         int expected = 10;
         GradeFileLoader gfl = new GradeFileLoader();
         File file = new File("test.txt");
         //act
         ArrayList<LetterGrade> grades = gfl.Load(file);
         int actual = grades.size();
         //assert
         assertEquals(expected,actual);
     }
}
