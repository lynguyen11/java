import java.util.Scanner;

public class WarmUp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 1;

        System.out.println("Input number between 10 and 15");
        int num = sc.nextInt();

        System.out.println("\n");
        
        while (count <= num){
            System.out.println(count);
            count++;
        }

        System.out.println("\n");

        count = 30;
        while (count >= num){
            System.out.println(count);
            count--;
        }

    }
}