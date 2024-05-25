import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        chooseOption();
    }

    public static void chooseOption() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU. Wybierz co chcesz zobaczyć:");
        System.out.println("1- liczbę pit stopów w wyścigu");
        System.out.println("2- czas trwania najdłuższego pit stopu wraz z numerem kierowcy");
        System.out.println("3- średni czas trwania pit stopów w całym wyścigu");
        System.out.println("4- numer pierwszego i ostatniego zjazdu na pit stop");
        System.out.println("5- aby opuścić program");
        System.out.println();

        int choose = 0;

        while(choose!=5) {

            System.out.println("Chcę zobaczyć:");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("x");
                    break;
                case 2:
                    System.out.println("y");
                    break;
                case 3:
                    System.out.println("z");
                    break;
                case 4:
                    System.out.println("zx");
                    break;
                default:
                    System.out.println();
            }
            if(choose == 5)
                System.out.println("Bye bye!");
        }

    }
}