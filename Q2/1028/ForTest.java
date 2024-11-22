public class ForTest{
    public void printCount(){
        for(int count = 1; count <= 100; count++){
            System.out.println(count);
        }
    }

    public void printCount(int max){
        for(int count = 1; count <= max; count++){
            System.out.println(count);
        }
    }

    public void printCount(int min, int max){
        for(int count = min; count <= max; count++){
            System.out.println(count);
        }
    }

    public int getFactorial(int num){
        int sum = 1;
        for(int count = 1; count <= num; count++){
            sum *= count;
        }
        return sum;
    }
}