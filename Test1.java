public class Test1 {
    public static void main(String[] args) {
        int a = 18, b = 7, d = 3;
        int c = a + b;
        System.out.println(c);
        System.out.println(b - a);
        System.out.println(a * b);
        System.out.println(c / b);
        System.out.println(a % b);

        System.out.println(a < b && a != b);
        System.out.println((a == b || a > b) && a % 2 == 0);
        System.out.println(!(a >= b));
        System.out.println(a <= b);

        System.out.println(++a + "," + --a + "," + b-- + "," + b++);
        System.out.println(a + "," + b + "," + c);

        System.out.println(a | b); //10010 | 111 / 00010111
        System.out.println(a & b); //10010 & 111 / 00000010
        System.out.println(a ^ b); //10010 ^ 111 / 00010101
        System.out.println(~c); // -(25+1)
        System.out.println(a<<1); //100100
        System.out.println(b>>2); //001
        System.out.println(c>>>3); //00011

        d += 11;
        System.out.println(d); //d = 14
        a -= d;
        System.out.println(a); //a = 4
        a &= 2; //000
        System.out.println(a); //a = 0

        int[] myArray = new int[3];
        myArray[0] = 5;
        System.out.println(myArray[1]);

        int[] arr = {1, 5, -5, 6, 7, 8};
        System.out.println(arr[2] < 0 ? "The third element is negative" : "The third element is positive");

        if(arr[4] % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");

    }
}