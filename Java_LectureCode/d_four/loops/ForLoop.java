package d_four.loops;

public class ForLoop {
    public static void main(String[] args){
        // print from 1 to 5
      /*  System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

       */

        // print from 1 to 10
        for (int i=0; i<=10; i++){
            System.out.print(i); //print(i) prints each i in one line
        }
        System.out.println("********************");
        for (int i=10; i>=0; i--){
            System.out.println(i); //println(i) prints each i in a new line
        }
        System.out.println("******print odd numbers**********");
        int oddNumSum = 0;
        for (int i=10; i>=0; i--){
            if(i%2 != 0) { // non zero remainder means odd number
                oddNumSum = oddNumSum + 1;
                System.out.println(i);
            }
        }
        System.out.println("******print sum of odd numbers**********");
        System.out.println("sum of Odd number is "+oddNumSum);


    }
}
