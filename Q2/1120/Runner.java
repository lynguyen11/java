public class Runner{
    public static void main(String[] args){

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 5 + 1);
        }

        Test t = new Test();

        t.print(array);
        t.contains(array, 3);
        int product = t.getProduct(array);
        System.out.println(product);
        int small = t.getSmallest(array);
        System.out.println(small);

    }
}