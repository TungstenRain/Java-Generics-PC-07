package ch18pc07;

/**
 * 
 * @author frank
 */
public class Ch18pc07 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
         //Create an array of Integer
         Integer[] numbers = {44, 77, 11, 99, 55, 22};

        // Create an Analyzer object.
        NumberAnalyzer<Integer> analyzer = new NumberAnalyzer<Integer>(numbers);
        
        // Display the highest value in the array.
        System.out.println("The highest value is " + analyzer.getHighest());

        // Display the lowest value in the array.
        System.out.println("The lowest value is " + analyzer.getLowest());

        // Display the total of the values in the array.
        System.out.println("The total of the values is " + analyzer.getTotal());

        // Display the average of the values in the array.
        System.out.println("The average of the values is " + analyzer.getAverage());
    }

}
