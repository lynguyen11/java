public class Count{
    int count = 2;
    int total = 0;
    public int getTotal(int num){
        while (count <= num){
            total = total + count;
            count += 2;
        }
        return total;
    }
}