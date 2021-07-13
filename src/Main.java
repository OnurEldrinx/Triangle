import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int row,space=0;

        System.out.print("Enter a number:");
        row = scanner.nextInt();

        for (int i = 0; i <= row - 1; i++)
        {
            for (int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            space++;
            for (int j = 1; j <= 2 * (row - i) - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
