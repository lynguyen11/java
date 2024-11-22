public class Runner{
    public static void main(String[] args){
        System.out.println("give me a number greater than 1");
        int num2 = sc.nextInt();
        int num3 = 1;
        while(num3<=num2){
            System.out.println("\n" + num3);
            num3 = num3+1;
        }
    }
}