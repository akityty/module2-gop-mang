import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[6];
        System.out.println("Nhap mang 1");
        for (int i = 0; i< array1.length; i++){
            System.out.print("Nhap phan tu thu "+i+" :");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Nhap mang 2");
        for (int i = 0; i< array2.length; i++){
            System.out.print("Nhap phan tu thu "+i+" :");
            array2[i] = scanner.nextInt();
        }
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i< array1.length; i++ ){
            array[i] = array1[i];
        }
        for (int i = 0; i< array2.length; i++){
            array[i+array1.length] = array2[i];
        }
        for (int i =0;i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
