
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            String[] part = input.split(",");

            if(oldest < Integer.parseInt(part[1])){
                oldest = Integer.parseInt(part[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
