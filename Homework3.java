public class Homework3 {
    public static void main(String[] args) {

        System.out.println("1.Create an array and fill it with 2 number.");

        int[] array;
        array = new int[]{2,2};

        System.out.println("\n2.Create an array and fill it with numbers from 1:1000.");
        int myArray[] =  new int[1000];
        for (int i = 0; i < 1000; i++) {
            myArray[i] = i + 1;
        }

        System.out.println("\n3.Create an array and fill it with odd numbers from -20:20");

        int anArray[] = new int[20];
        for (int i = 0, j = -19; i < 20; i++, j += 2) {
            anArray[i] = j;
        }

        System.out.println("\n4.Create an array and fill it. Print all elements which can be divided by 5.");

        int[] data = {4, 8, -6, 89, 45, 21, -85, 74, 96, -1056, 859, 65410};
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 5 == 0) {
                System.out.print(data[i] + " ");
            }
        }

        System.out.println("\n5.Create an array and fill it. Print all elements which are between 24.12 and 467.23.");

        double[] newData = {-2, 25, 7.5, 24, 48, -23.8, 85, 964, 455.3, 158, -962, 367.85};
        for (int i = 0; i < newData.length; i++) {
            if (newData[i] > 24.12 && newData[i] < 467.23) {
                System.out.print(newData[i] + " ");
            }
        }

        System.out.println("\n6.Create an array and fill it. Print count of elements which can be divided by 2.");

        int[] newArray = {-8, 5, 8, 12, 963, 4578, 964, -9696, 564, 21458, 85};
        int counter = 0;

        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println("7.Given an integer, 0< N < 21 , print its first 10 multiples.");

        int n = 5;

        System.out.println("input N = " + 2  + "\nOutput");

        for (int j = 1; j < 11; j++) {
            System.out.println(n  + " x " + j + " = " + n * j);
        }

        System.out.println("8.Given an array, every element appears twice, except for one, find that one.");

        int[] arr = {5, 8, 9, 12, 74, 74, 54, 8, 54, 9, 5};
        int a = 0;

        for (int i = 0; i <  arr.length; i++) {
            a ^= arr[i];
        }
        System.out.println(a);

    }
}
