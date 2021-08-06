import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. C -> F");
            System.out.println("2. F -> C");
            System.out.println("0. Exit");
            System.out.println("Nhập vào lựa chọn: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1: {
                    System.out.println("Nhập vào độ C : ");
                    celsius = scanner.nextDouble();
                    System.out.printf("%2.2f độ C = %2.2f độ F \n", celsius, celsiusToFahrenheit(celsius));
                    break;
                }
                case 2: {
                    System.out.println("Nhập vào độ F : ");
                    fahrenheit = scanner.nextDouble();
                    System.out.printf("%2.2f độ F = %2.2f độ C \n", fahrenheit, fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Bạn nhập sai mời nhập lại");
                }
            }
        }
        while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5)*celsius +32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celius = (5.0/9) * (fahrenheit -32);
        return celius;
    }
}
