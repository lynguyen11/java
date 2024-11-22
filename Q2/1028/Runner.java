public class Runner{
    public static void main(String[] args){
        ForTest ft = new ForTest();
        
        ft.printCount();
        ft.printCount(5);
        ft.printCount(5, 20);
        int fact = ft.getFactorial(5);
        System.out.println(fact);
    }
}