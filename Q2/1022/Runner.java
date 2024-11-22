import java.util.Scanner;
public class Runner{
	public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Selection sel = new Selection();
        System.out.println("What is your grade score?");
        int grade = sc.nextInt();
        sel.gradeCalculator(grade);

        String prompt = "yes";
        boolean ask = true;
        while (ask == true){
            System.out.println("Input zip code:");
            int zCode = sc.nextInt();
            System.out.println(sel.zipCode1(zCode));
            System.out.println("Continue? Type yes or no");
            prompt = sc.next();
            if (prompt.equals ("yes")||prompt.equals ("Yes")){
                ask = true;
            }
            else{
                ask = false;
            }
        }
        System.out.println("End.");
    }
}
