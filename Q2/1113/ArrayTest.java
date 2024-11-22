public class ArrayTest {
    public void printArray(int[] list) {
        for (int digit : list){
            System.out.print(digit + ", ");
        }
    }


    public boolean searchNumber1(int num, int[] list) {
        for (int each : list) {
            if (each == num) {
                return true;
            }
        }
        return false;
    }


    public int searchNumber2(int num, int[] list) {
        for (int i = 0;i <= list.length; i++){
            if (list[i] == num){
                return i;
            }
        }
        return -1;
    }
   
    public int findLargest(int[] list) {
        int max = list[0];
        for (int each : list) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    public int findSmallest(int[] list ){
        int smallest = list[0];
        for (int each : list){
            if (each < smallest){
                smallest = each;
            }
        }
        return smallest;
    }
       
    public int sum(int[] list){
        int ans = 0;
        for(int i = 0; i<list.length; i++){
            ans = ans + list[i];
        }
        return ans;
    }


    public int product(int[] list) {
        int product = 1;
        for (int each : list){
            product *= each;
        }
        return product;
    }
}