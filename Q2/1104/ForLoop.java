public class ForLoop{
    public void count(int num1, int num2){
        if (num1 < num2){
            for (int i = num1; i <= num2; i++){
                System.out.println(i);
            }
        }
        else{
            for (int i = num1; i >= num2; i--){
                System.out.println(i);
            }
        }
    }

    public int sum(int num){
        int total = 0;
        for(int i = 0; i <= num; i++){
            total += i;
        }
        return total;
    }
}