import java.util.Scanner;

public class Continents {

    public static void main(String[] Teja) {

        int continent;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter continent");
        continent = sc.nextInt();

        switch (continent) {

            case 1:
                System.out.println("North America");
                break;
            case 2:
                System.out.println("South America");
                break;
            case 3:
                System.out.println("Europe");
                break;
            case 4:
                System.out.println("Africa");
                break;
            case 5:
                System.out.println("Asia");
                break;
            case 6:
                System.out.println("Australia");
                break;
            case 7:
                System.out.println("Antarctica");
                break;
            default:
                System.out.println("undefined continet");
                break;
        }
    }
}
