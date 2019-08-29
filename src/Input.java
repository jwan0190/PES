import java.util.Scanner;
public class Input
{
    public Input(){}
    public String acceptInput(String information){
        Scanner input = new Scanner(System. in);
        System.out.println(information);
        return input.nextLine().trim();
    }
    public String acceptInput(String information, int gridSize){
        Scanner input = new Scanner(System.in);
        System.out.printf(information,gridSize - 1);
        return input.nextLine().trim();
    }

}

