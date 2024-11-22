public class ArrayTest{
    private int[] number;

    public ArrayTest(int num){
        number = new int[num];
        for(int i = 0; i < number.length; i++){
            number[i] = (int)(Math.random() * 9 + 1);
        }
    }

    public void print(){
        for(int each : number){
            System.out.println(each);
        }
    }
    
    public int getSum(){
        int total = 0;
        for(int i = 0; i < number.length; i++){
            total += number[i];
        }
        return total;
    }

    public int getLargest(){
        int largest = number[0];
        for(int i = 1; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        return largest;
    }

}