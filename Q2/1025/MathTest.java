public class MathTest{
    public void countUp(int count){
        int num = 1;
        while (num<=count){
            System.out.println(num);
            num++;
        }
    }
    public void countDown(int count){
        while (count>=1){
            System.out.println(count);
            count--;
        }
    }
    public int getSum(int number){
        int count = 1;
        int sum = 0;
        while (count <= number){
            sum = sum + count;
            count = count + 1;
        }
        
        return sum;
    }
}