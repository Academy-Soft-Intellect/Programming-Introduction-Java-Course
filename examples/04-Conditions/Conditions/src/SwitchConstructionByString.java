import java.util.Scanner;

public class SwitchConstructionByString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        String str = scanner.nextLine();
        switch (str) {
        case "a":
        case "b":
        case "c":
        {
            System.out.println("A,B,C");
            System.out.println("A,B,C");
            break;
        }
        case "x":
        case "y":
        case "z":
            System.out.println("X,Y,Z");
            System.out.println("X,Y,Z");
            break;
        }
        
        scanner.close();
        
    }
}
