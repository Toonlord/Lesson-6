import TerminalIO.*;

public class PayrollInterface {

    
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        Employee emp;//employee
        String name;//name
        int type;//type
        double rate;//hourly pay rate
        int hours;//hours worked
        String prompt;//user prompt
        emp=new Employee();
        while(true){
            //get  the name and break if blank
            System.out.println("Enter employee data");
            name = r.readLine(" Name (or <enter> to quit): ");
            if(!(emp.setName(name)))break;
            //Get the type until valid
            while(true){
                prompt = " Type ("+emp.getTypeRules()+"): ";
                type 
            }
        }
    }
    
}
