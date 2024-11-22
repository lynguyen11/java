
//Bank Class
public class Bank{
    private String name;
    private int pin;
    private boolean access;
    private double balance;

    public Bank(String name, int pin, double balance){
        this.name = name;
        this.pin = pin;
        this.access = false;
        this.balance = balance;
    }

    public String getName(){
        if( access == true ){
            return name;
        } else{
            return "Please login";
        }
    }

    public void checkPin(int userInput){
        if(userInput == pin){
            access = true;
        } else {
            access = false;
        }
    }

    public boolean getAccess(){
        return access;
    }
    
	public double getBalance(double balance){
        this.balance = balance;
      	return balance;
    }
}

