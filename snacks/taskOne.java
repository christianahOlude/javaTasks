public class taskOne {
    public static void main(String[] args) {
        numbers(6,3);


    }

    public static void numbers(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.print(num1 +" "+ num2);


    }
}
