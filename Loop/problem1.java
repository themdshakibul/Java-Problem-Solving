package Loop;

public class problem1 {
    public static void main(String[] args) {
        /*
        Problem:
            Print the 1st 10 even numbs
        */

       for(int i=1; i <= 10; i++){
        // i > 1, 2, 3, 4, 5, 6, 7, 8, 9, 10;
                // 2, 4, 6, 8, 10, 12, 14, 16, 18, 20;
           System.out.println(i*2);
       }


       int i = 1;
       while (i <= 10) {
        System.out.println(i*2);
        i++;
       }
    }
}
