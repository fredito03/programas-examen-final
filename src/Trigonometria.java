import java.util.Scanner;

public class Trigonometria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Seno de X");
            System.out.println("2. Coseno de X");
            System.out.println("3. Tangente de X");
            System.out.println("4. Cotangente de X");
            System.out.println("5. Secante de X");
            System.out.println("6. Cosecante de X");
            System.out.println("7. Salir");
            System.out.print("Hola, selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularSeno();
                    break;
                case 2:
                    calcularCoseno();
                    break;
                case 3:
                    calcularTangente();
                    break;
                case 4:
                    calcularCotangente();
                    break;
                case 5:
                    calcularSecante();
                    break;
                case 6:
                    calcularCosecante();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida, Por favor, seleccione una opcion del menu");
            }
        } while (opcion != 7);
    }

    public static void calcularSeno() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de X en grados: ");
        double x = scanner.nextDouble();
        double resultado = Math.sin(Math.toRadians(x));
        System.out.println("Seno de " + x + " grados es " + resultado + "\n");
    }

    public static void calcularCoseno() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de X en grados: ");
        double x = scanner.nextDouble();
        double resultado = Math.cos(Math.toRadians(x));
        System.out.println("Coseno de " + x + " grados es " + resultado + "\n");
    }

    public static void calcularTangente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de X en grados: ");
        double x = scanner.nextDouble();
        double resultado = Math.tan(Math.toRadians(x));
        System.out.println("Tangente de " + x + " grados es " + resultado + "\n");
    }

    public static void calcularCotangente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de X en grados: ");
        double x = scanner.nextDouble();
        double resultado = 1 / Math.tan(Math.toRadians(x));
        System.out.println("Cotangente de " + x + " grados es " + resultado + "\n");
    }

    public static void calcularSecante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de X en grados: ");
        double x = scanner.nextDouble();
        double resultado = 1 / Math.cos(Math.toRadians(x));
        System.out.println("Secante de " + x + " grados es " + resultado + "\n");
    }

    public static void calcularCosecante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de X en grados: ");
        double x = scanner.nextDouble();
        double resultado = 1 / Math.sin(Math.toRadians(x));
        System.out.println("Cosecante de " + x + " grados es " + resultado + "\n");
    }
}