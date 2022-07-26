package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not > 20");
            }
        } while (size > 20);

        // Khai báo kiểu dữ liệu của mảng
        int[] array;
        // Khai báo độ dài mảng
        array = new int[size];

        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i+1));
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s" , "Element in array: " , "");

        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }

        for(int j = 0; j < array.length/2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s" , "Reverve array: " , "");

        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
    }
}