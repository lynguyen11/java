public class ForTest2{
    public int count;
    public void printCount1(int num1, int num2){
        for(int i = num1; i <= num2; i++){
            System.out.println(i);
        }
    }

    public void printCount2(int num1, int num2){
        while (num1 <= num2){
            System.out.println(num1);
            num1++;
        }
    }

    int sum;
    public int getSum1(int num){
        for (int count = 0; count <= num; count++){
            sum = sum + count;
        }
        return sum;
    }

    public int getSum2(int num){
        sum = 0;
        while (count <= num){
            sum = sum + count;
            count++;
        }
        return sum;
    }
}