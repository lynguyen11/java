public class Test{
    public void randomCount(){
        int num = (int)(Math.random() * 11 + 10);
        for (int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }

    public void randomSquare(){
        int length = (int)(Math.random() * 6 + 5);
        int width = (int)(Math.random() * 6 + 5);
        for (int i = 0; i <= length; i++){
            for (int wid = 0; wid <= width; wid++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}