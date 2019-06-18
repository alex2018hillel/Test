import java.util.Scanner;

public class AlgorithmsBasicTheory3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Inserted array elements multiple of 3:");
        for (int i = 0; i < size; i++) {
            if ((array[i]% 3) == 0)
                System.out.print (" " + array[i]);
        }
    }
}