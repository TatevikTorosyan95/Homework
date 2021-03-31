public class Test {
    public static void main(String[] args) {
        byte n1 = -12;
        System.out.println(n1);
        n1 = 127;
        System.out.println(n1);
        short n2 = 564;
        System.out.println(n2);
        int n3 = 23456788;
        System.out.println(n3);
        long n4 = 5858587455L;
        System.out.println(n4);
        int a=1, b=2;
        int c = a++ - --b;
        System.out.println(--a + ++c);
        System.out.println(b++ - c--);
        System.out.println(a + ',' + b + ','+c);
    }
}
