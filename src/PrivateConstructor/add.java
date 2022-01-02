package PrivateConstructor;

public class add {

    public static void main(String[] args) {
        int result;
//        int first = 2;
//        int second = 3;
//        //result = addTwoNumbers(first,second);
        System.out.println(addTwoNumbers(2.5f , 4.5f));
        System.out.println(addTwoNumbers(2,4));
    }
    private static int addTwoNumbers(int first,int second){
        return first+second;
    }
    private static float addTwoNumbers(float first,float second){
        return first+second;
    }
}
