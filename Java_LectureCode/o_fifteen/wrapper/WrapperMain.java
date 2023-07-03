package o_fifteen.wrapper;

public class WrapperMain {

    static Integer age;

    public static void main(String[] args){
        Integer num = 10;
        Integer num2 = new Integer(12345);
        Double salary = 23454.34;
        Double salary2 = new Double(23454.34);

        Float a = 2345.3f;
        Float a2 = new Float(2345.3f);
        //Long ln = 2356721;
       // Long ln2 = new Long(2356721);
        Character c = 'A';
        Character c2 = new Character('A');
        Boolean b = new Boolean(true);

        String roll = "1234";
        Integer r = Integer.parseInt(roll);
        r = Integer.valueOf(roll);
        Double d = Double.parseDouble(roll);
        System.out.println(r);
        System.out.println(d);

        int x = 55;
        Integer y = x;
        System.out.println(x);
        System.out.println(y);

        Double d1 = 28.79;
        double z = d1;
        System.out.println(d1);
        System.out.println(z);
        System.out.println(age);
    }
}
