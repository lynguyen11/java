public class Test{
    public void print(int[] num){
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }

    public boolean contains(int[] array, int num1){
        for (int i = 0; i < array.length; i++){
            if (num1 == array[i]){
                return true;
            }
        }
        return false;
    }

    int total = 1;
    public int getProduct(int[] array){
        for (int i = 0; i < array.length; i++){
            total = total * array[i];
        }
        return total;
    }

    int smallest = 5;
    public int getSmallest(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
}