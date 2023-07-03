package k_eleven.arrays;

public class ArrayDemo {
    public static void main(String args[]){
        int arrayofAadhar[] =new int[5];
        System.out.print(arrayofAadhar[3]);
        arrayofAadhar[3]=25568;

        for(int i=0; i<arrayofAadhar.length;i++){
            System.out.println(arrayofAadhar[i]);
        }
        for(int a:arrayofAadhar){
            System.out.println(arrayofAadhar[a]);
        }
        arrayofAadhar=new int[6];
        arrayofAadhar[0]=1001;
        arrayofAadhar[1]=1002;
        arrayofAadhar[2]=1003;
        arrayofAadhar[3]=1004;
        arrayofAadhar[4]=1005;
        arrayofAadhar[5]=1006;
        int[] arrayofAadhar1 = null;
        System.out.println("----------------");
        int found=0;
        for(int a:arrayofAadhar){
            System.out.println(a);
        }
    }
}
