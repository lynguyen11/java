//Nested loops class
public class NestedLoops{
	public void drawFilledBox(){
        for(int outer = 1; outer<=10; outer++){
            for(int inner = 1; inner<=10; inner++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public void drawFilledBox(int a,int b){
        for(int outer = 1; outer<=a; outer++){
            for(int inner = 1; inner<=b; inner++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
  
    public void drawMultiChart(){
        for(int outer = 1; outer <=9; outer++){
            for(int inner = 1; inner <= 9; inner++){
                System.out.print("\t" + inner*outer);
            }
            System.out.println();
        }
    }
  
    public void drawTriangle(){
        int c = 1;
        for(int outer = 1; outer<=5; outer++){
            for(int inner = 1; inner<=c; inner++){
                System.out.print("*");
            }
            System.out.println();
            c++;
        }
    }
}