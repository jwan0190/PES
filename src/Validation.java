public class Validation
{
    public Validation(){}
    public static boolean isValidInt(String input){
        try{
            Integer.parseInt(input);
        }
        catch(NumberFormatException e){
            System.out.println("Your input is not valid integer");
            return false;
        }
        return true;
    }
    public static boolean isValidName(String input){
        if(3<= input.length() & input.length()<=15)return true;
        System.out.println("Ship name lenght should be between 3 - 15!");
        return false;
    }
    public static boolean isInRange(int position, int size){
        if(0<=position & position <= size){
            return true;
        }
        System.out.printf("Please input a number between 0 - %d!", size-1);
        return false;
    }
}
