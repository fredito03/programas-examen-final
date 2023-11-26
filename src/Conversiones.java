import java.util.Scanner;

public class Conversiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- Menu de Conversiones --- ");
            System.out.println("1. Kilometros a Millas");
            System.out.println("2. Euros a Dolares");
            System.out.println("3. Litros a Galones");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirKilometrosAMillas();
                    break;
                case 2:
                    convertirEurosADolares();
                    break;
                case 3:
                    convertirLitrosAGalones();
                    break;
                case 4:
                    System.out.println("Saliendo... Vuelva pronto");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion del menu.");
            }
        } while (opcion != 4);
    }

    public static void convertirKilometrosAMillas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de kilometros: ");
        double kilometros = scanner.nextDouble();
        double millas = kilometros * 0.621371;
        System.out.println(kilometros + " kilometros son aproximadamente " + millas + " millas.\n");
    }

    public static void convertirEurosADolares() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Euros: ");
        double euros = scanner.nextDouble();
        double dolares = euros * 1.10;
        System.out.println(euros + " Euros son aproximadamente " + dolares + " Dolares.\n");
    }

    public static void convertirLitrosAGalones() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de litros: ");
        double litros = scanner.nextDouble();
        double galones = litros * 0.264172;
        System.out.println(litros + " litros son aproximadamente " + galones + " galones.\n");
    }
}