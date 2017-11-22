import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    int choice, a, b;
    Scanner scanner;

    public Calculator(){
        scanner = new Scanner(System.in);
        System.out.println("Witaj w kalkulatorze!");
        instruction();

        while (choice != 5){
            choice = scanner.nextInt();
            if(choice <= 0 || choice > 5){
                System.out.println("Nie ma takiej instrukcji");
                instruction();
            }

            switch (choice){
                case 1:{
                    getNumbers();
                    System.out.println("Wynik dodawania to: " + add(a, b));
                    instruction();
                    break;
                }

                case 2:{
                    getNumbers();
                    System.out.println("Wynik odejmowania to: " + substract(a, b));
                    instruction();
                    break;
                }

                case 3: {
                    getNumbers();
                    System.out.println("Wynik mnożenia to: " + multiply(a, b));
                    instruction();
                    break;
                }

                case 4: {
                    getNumbers();
                    System.out.println("Wynik dzielenia to: " + divide(a, b));
                    instruction();
                    break;
                }
            }
        }
    }

    void instruction() {
        System.out.print("Co chcesz zrobić?");
        System.out.print("\n 1 - dodawać\n 2 - odejmować\n 3 - mnożyć\n 4 - dzielić\n 5 - wyjść z programu\n");
        System.out.print("Twój wybór to: ");
    }

    void getNumbers(){
        System.out.println("Podaj dwie liczby całkowite: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
    }

    long add(int a, int b){
        return a + b;
    }

    int substract(int a, int b){
        return a - b;
    }

    long multiply (int a, int b){
        return a * b;
    }

    double divide (int a, double b) throws IllegalArgumentException{
        if (b == 0) throw new IllegalArgumentException("Nie dzielimy przez 0");
        return a/b;
    }
}
