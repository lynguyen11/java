public class Test{
    public void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public int find(int[] array, int num){
        for(int i = 0; i < array.length; i++){
            if(num == array[i]){
                return num;
            }
        }
        return -1;
    }

    int total;

    public int getSummation(int[] array){
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        return total;
    }

    int num = 0;
    public int getSmallest(int[] array){
        for(int i = 0; i < array.length; i++){
            if (num > array[i]){
                num = array[i];
            }
        }
        return num;
    }
}