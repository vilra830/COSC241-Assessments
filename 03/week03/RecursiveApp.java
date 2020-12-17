package week03;


public class RecursiveApp{

    public static void main (String[] args){



    }

    public static long digits(long n){
        long num_digits = 0;

        if n <10 then
                  return 1;
        end if

            return 1 + digits(n/10);
            

    }

    public static long sumOfDigits(long n){
        long sum = 0;

        if n <10 then 
        
        while ( n > 0){
            sum = sum + n % 10;
            n = n / 10;

        }
        
        
        return sum;
    }

    public static long sumOfDigitsNegative (long n){

        long sum = 0;
        while ( n > 0){
            sum = sum + n % 10;
            n = n / 10;

        }

        return -sum;

    }
        

}
