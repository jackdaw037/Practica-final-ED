import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Menu programa
        System.out.println("Bienvenido al menu, a continuacion verás 5 opciones de programa.");
        System.out.println("1) Calculadora.");
        System.out.println("2) Calculador de edad.");
        System.out.println("3) Conversor de temperatura.");
        System.out.println("4) Contador de Palabras i Caracteres.");
        System.out.println("5) Generador de saludos.");
        System.out.println("Introduce una opción del 1 al 5.");

        int opcion = sc.nextInt();

        System.out.println("Has escogido la opción " + opcion+".");

        if (opcion == 1) {
            double resultado = 0;

            System.out.print("Ingresa el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Ingresa el operador (+, -, *, /): ");
            char operador = sc.next().charAt(0);

            System.out.print("Ingresa el segundo número a operar: ");
            double num2 = sc.nextDouble();

            if (operador == '+') {
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
            } else if (operador == '-') {
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
            } else if (operador == '*') {
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
            } else if (operador == '/') {
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: no se puede dividir entre cero.");
                }
            } else {
                System.out.println("Operador no válido.");
            }
        }
        else if (opcion == 2) {

            System.out.println("Bienvenido al calculador de edad, a continuación introduzca su año de nacimiento:");

            int anoNacimiento = sc.nextInt();
            int operacionEdad = 2025 - anoNacimiento;

            System.out.println("Su año de nacimiento es " + anoNacimiento + " y su edad es " + operacionEdad + ".");

        }
        else if (opcion == 3) {

        }
        else if (opcion == 4) {

        }
        else if (opcion == 5) {

        }
        else {
            System.out.println("Has escogido una opción incorrecta.");
        }





        // Calculador de edad

    }
}

