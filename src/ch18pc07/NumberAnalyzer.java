package ch18pc07;

/**
 * 
 * @author frank
 */
public class NumberAnalyzer<T extends Number>{
     //create an generic array T
    T[] numberObject;
    
    public NumberAnalyzer(T[] values) {
        //set values
        numberObject = values;
    }

    /*The method getHighest returns the maximum value**/
    public T getHighest() {
        //Assume first element is maximum
        T max = numberObject[0];
        
        for (int i = 1; i < numberObject.length; i++) {
            //check for maximum value
            if (numberObject[i].doubleValue() > max.doubleValue()) {
                max = numberObject[i];
            }
        }
        return max;
    }
    
    /*The method getLowest returns the minimum value**/
    public T getLowest() {
        //assume first element is minimum
        T min = numberObject[0];

        //check for miimum value
        for (int i = 1; i < numberObject.length; i++) {
            if (numberObject[i].doubleValue() < min.doubleValue()) {
                min=numberObject[i];
            }
        }
        return min;
    }

    /*The method getTotal returns
    *the total of generic type values*/
    public double getTotal() {
        //set total to zero
        double total = 0;
        
        for (T number : numberObject) {
            //add number to total value
            total += number.doubleValue();
        }
        return total;
    }
    
    /*The method getAverage returns
    *the average of generic type values*/
    public double getAverage() {
        return getTotal()/numberObject.length;
    }
}