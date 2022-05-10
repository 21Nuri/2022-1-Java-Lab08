package edu.handong.csee.java.hw2.math;


/**
 * This is MathCalculator class.
 */
public class MathCalculator {
    private String name;

    /**
     * This set your name.
     * @param name Input name.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Returns set name.
     * @return Set name.
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the greater a two int values.
     * @param n1 First int value.
     * @param n2 Second int value.
     * @return The greater a two int values.
     */
    public int getMax(int n1, int n2){
        if(n1 >= n2) return n1;
        else return n2;
    }

    /**
     * Returns the smaller of two int values.
     * @param n1 First int value.
     * @param n2 Second int value.
     * @return The smaller of two int values.
     */
    public int getMin(int n1, int n2){
        if(n1 <= n2) return n1;
        else return n2;
    }

    /**
     * Returns the absolute value of int value.
     * @param n Int value that you want to know the absolute value
     * @return Absolute value of int value.
     */
    public int getAbs(int n){
        if(n < 0) return n*(-1);
        else return n;
    }

    /**
     * Returns the sum value of two int values.
     * @param n1 First int value.
     * @param n2 Second int value.
     * @return Sum value of two int values.
     */
    public int getSum(int n1, int n2){
        return(n1+n2);
    }

    /**
     * Returns the difference value of two int values.
     * @param n1 First int value.
     * @param n2 Second int value.
     * @return Difference of two int values.
     */
    public int getDiff(int n1, int n2){
        return(n1-n2);
    }
    
    /**
     * Returns the multipy value of two int values.
     * @param n1 First int value.
     * @param n2 Second int value.
     * @return Mulitpy value of two int values.
     */
    public int getProduct(int n1, int n2){
        return(n1*n2);
    }

    /**
     * Returns the divide value of two int values.
     * @param n1 First int value.
     * @param n2 Second int value.
     * @return Divide value of two int values.
     */
    public int getQuotient(int n1, int n2){
        return(n1/n2);
    }

    /**
     * Returns the remainder values of two int values.
     * @param n1 First int value.
     * @param n2 Second int value.
     * @return Reminder values of two int values.
     */
    public int getRemainder(int n1, int n2){
        return(n1%n2);
    }

    /**
     * Returns the value of the first value raised to the power of the second value.
     * @param n1 First int value.
     * @param n2 Second int value.
     * @return first value raised to the power of the second value.
     */
    public int getPower(int n1, int n2){
        int r = 1;
        for(int i = 0; i<n2; i++){
            r *= n1;
        }
        return r;
    }

    /**
     * Returns the factorial value.
     * @param n Int value.
     * @return The factorial value.
     */
    public int getFactorial(int n){
        if(n == 0) return 1;
        else if(n<=1) return n;
        else return getFactorial(n-1)*n;
    }

    /**
     * Returns the greatest common divisor of two int value.
     * @param n1 First int value.
     * @param n2 Second int value.
     * @return The greatest common divisor of two int value.
     */
    public int getGcd(int n1, int n2){
        int tmp;
        if(n1 < n2){
            tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        int r1 = n2;
        int r2 = n1 % n2;
        while(true){
            if(r2 == 0) break;
            tmp = r2;
            r2 = r1 % r2;
            r1 = tmp;
        }
        return r1;
    }

    /**
     * Returns the least common mulitple of two int value.
     * @param n1 First int value.
     * @param n2 Second int value.
     * @return The least common mulitple of two int value.
     */
    public int getLcm(int n1, int n2){
        return (n1 * n2) / getGcd(n1, n2);
    }

    /**
     * Returns the square root of a int value.
     * @param n Int value.
     * @return Square root of a int value.
     */
    public int getSquare(int n){
        // for(int i = 0; i<n; i++){
        //     if(i*i == n) return i;
        // }
        // return -1;
        return ((int)Math.sqrt(n));
    }
}