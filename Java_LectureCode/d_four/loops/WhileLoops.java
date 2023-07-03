package d_four.loops;

public class WhileLoops {
    public static void main(String[] args){
        // while loops are dependent on logic, not numeric values
        int num = 10;
        while(num > 0){ // loop terminates when condition terminates
            System.out.println(num);
            num = num - 1; //decrement
        }
    }
}
