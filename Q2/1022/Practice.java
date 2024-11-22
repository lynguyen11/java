//Loops
import java.util.Scanner;
public class Practice{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int count = 8;
        //number one
        while(count<=30){
            System.out.println(count);
            count = count +2;
  	    }
  	
        System.out.println("\n");
        count = 8;
    
        //number two
        do{
            System.out.println(count);
            count = count + 2;
        }
        while(count<=30);
  
  	    //number three
        count = 2;
        int ans = 0;
        while(count<=19){
            ans = ans+count;
            count = count + 1;
        }
        System.out.println(ans);

        ans = 189;
        count = 2;
        //number four
  	    do{
            count = count + (count + 1);
        }
        while(count<=ans);
        System.out.println(ans);
  
  
        //number five
        count = 1;
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num > 0){
            while(count <= num){
                System.out.println("\n" + count);
                count = count + 1;
            }
        }
        if(num<0){
            while(count >= num){
                System.out.println(count);
                count = count -1;
            }
        }
    }
}
