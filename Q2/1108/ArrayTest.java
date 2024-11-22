public class ArrayTest{
    public void arrayDemo1(){
        System.out.println("Demo 1");
        int[] num = new int[5];
        
        num[0] = (int)(Math.random() * 15 + 1);
        num[1] = (int)(Math.random() * 15 + 1);
        num[2] = (int)(Math.random() * 15 + 1);
        num[3] = (int)(Math.random() * 15 + 1);
        num[4] = (int)(Math.random() * 15 + 1);

        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
    }

    public void arrayDemo2(){
        System.out.println("Demo 2");
        int[] num = new int[25];
        //assigning
        for (int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random() * 9 + 1);
        }
        for (int j = 0; j < num.length; j++){
            System.out.println(num[j]);
        }
    }

    public void arrayDemo3(){
        System.out.println("Demo 3");
        String[] word = new String[5];
        
        word[0] = "bob";
        word[1] = "hand";
        word[2] = "table";
        word[3] = "pizza";
        word[4] = "food";

        for (int i = 0; i < word.length; i++){
            System.out.println(word[i]);
        }
    }
}
