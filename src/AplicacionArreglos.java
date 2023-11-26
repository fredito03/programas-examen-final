import java.util.Arrays;
import java.util.Scanner;

public class AplicacionArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-- Menu -- ");
            System.out.println("1. Operación Intersección");
            System.out.println("2. Operación Complemento");
            System.out.println("3. Cuenta Palabras en una frase");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion del menu: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    interseccionDeConjuntos();
                    break;
                case 2:
                    complementoDeConjuntos();
                    break;
                case 3:
                    cuentaDePalabras();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, selecciona una opcion del menu");
            }
        } while (opcion != 4);
    }

    public static void interseccionDeConjuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del Conjunto A: ");
        int sizeA = scanner.nextInt();
        int[] conjuntoA = leerConjunto(sizeA);

        System.out.println("Ingrese el tamaño del Conjunto B: ");
        int sizeB = scanner.nextInt();
        int[] conjuntoB = leerConjunto(sizeB);

        int[] interseccion = calcularInterseccion(conjuntoA, conjuntoB);
        System.out.println("La intersección entre Conjunto A y Conjunto B es: " + Arrays.toString(interseccion) + "\n");
    }

    public static void complementoDeConjuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del Conjunto A: ");
        int sizeA = scanner.nextInt();
        int[] conjuntoA = leerConjunto(sizeA);

        System.out.println("Ingrese el tamaño del Conjunto B: ");
        int sizeB = scanner.nextInt();
        int[] conjuntoB = leerConjunto(sizeB);

        int[] complemento = calcularComplemento(conjuntoA, conjuntoB);
        System.out.println("El complemento de Conjunto A con respecto a Conjunto B es: " + Arrays.toString(complemento) + "\n");
    }

    public static void cuentaDePalabras() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        int palabras = contarPalabras(frase);
        System.out.println("La frase introducida tiene " + palabras + " palabra(s).\n");
    }

    public static int[] leerConjunto(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] conjunto = new int[size];

        System.out.println("Ingrese los elementos del conjunto, separalos por espacios: ");
        for (int i = 0; i < size; i++) {
            conjunto[i] = scanner.nextInt();
        }

        return conjunto;
    }

    public static int[] calcularInterseccion(int[] conjuntoA, int[] conjuntoB) {
        return Arrays.stream(conjuntoA)
                .filter(elemento -> Arrays.stream(conjuntoB).anyMatch(e -> e == elemento))
                .toArray();
    }

    public static int[] calcularComplemento(int[] conjuntoA, int[] conjuntoB) {
        return Arrays.stream(conjuntoA)
                .filter(elemento -> Arrays.stream(conjuntoB).noneMatch(e -> e == elemento))
                .toArray();
    }

    public static int contarPalabras(String frase) {
        String[] palabras = frase.split("\\s+");
        return palabras.length;
    }
}