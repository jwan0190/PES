
public class PMS {
    public void main(String args[]){
        //Welcome Screen
        System.out.println("Welcome using Prime Event System.");
        //Get user input
        while(true) {
            System.out.println("Please choose an option:");
            Input input = new Input();
            String option = input.acceptInput("1. Login\n2. Register\n3. Exit");
            if (Validation.isValidInt(option)) {
                break;
            }
            else System.out.println("Your input is invalid please try again");
        }
    }
}
