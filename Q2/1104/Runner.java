import java.util.Scanner;

public class Runner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rand;
        for(int count = 1; count<=5; count ++){
            rand = (int) (Math.random()*6);
            System.out.println(rand);
        }

        System.out.println();

        for(int count = 1; count<=5; count ++){
            rand = (int) (Math.random()*6+5);
            System.out.println(rand);
        }

        System.out.println();

        for (int i = 0; i <= 5; i++){
            int num = (int)(Math.random() * 36 + 15);
            System.out.println(num);
        }

        System.out.println();

        System.out.println("Input number greater than 10: ");
        int num = sc.nextInt();

        System.out.println();

        for (int i = 1; i <=5; i++){
            rand = (int)(Math.random() * (num - 9)+ 10);
            System.out.println(rand);
        }

        System.out.println();

        for(int count = 1; count<=10; count ++){
            rand = (int) (Math.random()*6+1);
            int rand2 = (int) (Math.random()*6+1);
            System.out.println(rand + ", " + rand2);
            if(rand == rand2){
                if(rand == 1){
                    System.out.println("Snake Eyes");
                }
                System.out.println("Same");
            }
            if (rand+rand2 == 2){
                System.out.println("even");
            }
            if (rand+rand2 == 4){
                System.out.println("even");
            }
            if (rand+rand2 == 6){
                System.out.println("even");
            }
            if (rand+rand2 == 8){
                System.out.println("even");
            }
            if (rand+rand2 == 10){
                System.out.println("even");
            }
            if (rand+rand2 == 12){
                System.out.println("even");
            }
        }
    }
}