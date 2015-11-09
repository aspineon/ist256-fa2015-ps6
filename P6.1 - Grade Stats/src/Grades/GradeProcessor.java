package Grades;

import java.util.ArrayList;

/**
 * Processes a collection of LetterGradeEnums
 * @author mafudge
 */
public class GradeProcessor {
    /**
     * The collection of LetterGradeEnum to process
     */
    private final ArrayList<LetterGrade> grades;
    
    /**
     * Creates a new grade processor for the list of grades
     * @param grades the collection of grades to process.
     */
    public GradeProcessor( ArrayList<LetterGrade> grades ) {
        this.grades = grades;
    }
    
    /**
     * Returns the number of grades in the collection
     * @return the count (number) of grades as an int
     */
    public int Count() {
        // TODO: Write code here
        return -1;
    }
    
    /**
     * Returns the Mean GPA (Grade Point Average) for the collection of grades.
     * @return The average of the grades as a double
     */
    public double GPA() {
        // TODO: Write code here. 
        return -0.1;
    }
    
    /**
     * Returns the Mean as a letter grade (A, F, C+, etc...)
     * @return LetterGrade for the mean
     */
    public LetterGrade Mean() {
        // TODO: Write code here
        return null;
    }
    
    /**
     * Returns the lowest grade in the collection
     * @return LetterGrade representing the lowest grade
     */
    public LetterGrade Lowest() {
        // TODO: Write code here. 
        return null;
    }
    
    /**
     * Returns the highest grade in the collection
     * @return LetterGrade representing the grade
     */
    public LetterGrade Highest() {
        // TODO: Write code here. 
        return null;
    }
    
    /**
     * Returns a count (frequency) of the number of LetterGrade in the collection 
     * of grades. For example you might get a count of C+.
     * @param grade The grade to count (eg. A, B+, F)
     * @return The frequency of that grade.
     */
    public int Frequency( LetterGrade grade ) {
        //TODO: Write code here
        return -1;
    }
          
}
