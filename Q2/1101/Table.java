public class Table{
    private int row;
    private int col;

    public Table(int r, int c){
        row = r;
        col = c;
    }

    public void printDrawBox(){
        for (int ro = 0; ro < row; ro++){ //columns
            for (int i = 0; i < col; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}