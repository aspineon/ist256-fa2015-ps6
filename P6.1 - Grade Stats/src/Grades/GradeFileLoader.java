/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grades;

import java.io.File;
import java.util.ArrayList;

/**
 * This class is used to load a grade file into an array list.
 * @author mafudge
 */
public class GradeFileLoader {
    
    /**
     * This method loads grades from file and returns an arraylist. It should only
     * include those grades which translate to points like A- or B+, and ignore 
     * grades like NA or I
     * @param file the java.io.file to load the grades from.
     * @return an ArrayList of LetterGrade as read from the file
     */
    public ArrayList<LetterGrade> Load(File file) {
        // TODO: Write code here
        ArrayList<LetterGrade> grades = new ArrayList();

        return grades;
    }
}
