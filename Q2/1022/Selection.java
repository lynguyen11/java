//Method Class
public class Selection{
    public void gradeCalculator(int grade){
        if(grade>= 90){
            System.out.println("A");
        }
        else if(grade<=89 && grade>=80){
            System.out.println("B");
        }
        else if(grade<79 && grade>=70){
            System.out.println("C");
        }
        else if(grade<69 && grade>= 60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
      
    
    public String zipCode1(int code){
      if (code == 94040){
        return "Mountain View";
      }
      else if (code == 94115){
        return "San Francisco";
      }
      else if (code == 95051){
        return "Santa Clara";
      }
      else if (code == 95129){
        return "San Jose";
      }
      else if (code == 94607){
        return "Oakland";
      }
      else if (code == 95035){
        return "Milpidas";
      }
      return "Not valid";
    }
    
    public String zipCode2(int code){
        switch (code){
            case 94040:
                return "Mountain View";
            case 94115:
                return "San Francisco";
            case 95051:
                return "Santa Clara";
            case 95129:
                return "San Jose";
            case 94607:
                return "Oakland";
            case 95035:
                return "Milpitas";
            default:
                return "Not valid";
            }
    }
}