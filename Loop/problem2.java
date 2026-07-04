/*
Problem 2:

    FizzBuzz Problem
    print numbs form 1 to 20
    if numbers is divisible by 3  Print "Fizz"
    if numbers is divisible by 5 print "Buzz"
    if numbers is divisible by 3 and 5 print "FizzBuzz"
    else print the number
*/
package Loop;

public class problem2 {
    public static void main(String [] args){

       for(int i=1; i<= 20; i++){
        if (i % 3 == 0) {
            System.out.print("Fizz");
        }
        if(i % 5 == 0){
            System.out.print("Buzz");
        }
        if (i % 3 != 0 && i % 5 != 0) {
            System.out.println(i);
        }
        else{
            System.out.println(i);
        }
        
       }
    }
}
