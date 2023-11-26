import java.util.Scanner;

public class CalculoDeSalarios {
    private static final double PORCENTAJE_COMISION = 0.10;
    private static final double requisitoVentasMensuales = 20000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de cálculo de salarios y comisiones");

        int numVendedores = obtenerNumeroVendedores(scanner);

        for (int i = 0; i < numVendedores; i++) {
            System.out.println("\n--- Ingrese datos para el vendedor " + (i + 1) + " ---");
            Vendedor vendedor = lecturaDeDatos(scanner);
            mostrarResultados(vendedor);
        }
    }

    public static int obtenerNumeroVendedores(Scanner scanner) {
        System.out.print("Ingresa el número de vendedores: ");
        return scanner.nextInt();
    }

    public static Vendedor lecturaDeDatos(Scanner scanner) {
        System.out.print("Ingresa el nombre del vendedor: ");
        String nombre = scanner.next();

        System.out.print("Ingresa el código del vendedor: ");
        int codigo = scanner.nextInt();

        System.out.print("Ingresa el sueldo base del vendedor: ");
        double sueldoBase = scanner.nextDouble();

        System.out.print("Ingresa el número de ventas semanales del vendedor: ");
        int ventasSemanales = scanner.nextInt();

        return new Vendedor(nombre, codigo, sueldoBase, ventasSemanales);
    }

    public static double calcularComisiones(int ventasSemanales) {
        double ventasMensuales = ventasSemanales * 4.0;
        return (ventasMensuales > requisitoVentasMensuales) ? ventasMensuales * PORCENTAJE_COMISION : 0.0;
    }

    public static double calcularSalarioBruto(double sueldoBase, double comisiones) {
        return sueldoBase + comisiones;
    }

    public static void mostrarResultados(Vendedor vendedor) {
        double comisiones = calcularComisiones(vendedor.getVentasSemanales());
        double salarioBruto = calcularSalarioBruto(vendedor.getSueldoBase(), comisiones);

        System.out.println("\n--- Resultados para el vendedor ---");
        System.out.println("Nombre: " + vendedor.getNombre());
        System.out.println("Código: " + vendedor.getCodigo());
        System.out.println("Comisiones: Q" + comisiones);
        System.out.println("Salario Bruto: Q" + salarioBruto);
    }

    static class Vendedor {
        private String nombre;
        private int codigo;
        private double sueldoBase;
        private int ventasSemanales;

        public Vendedor(String nombre, int codigo, double sueldoBase, int ventasSemanales) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.sueldoBase = sueldoBase;
            this.ventasSemanales = ventasSemanales;
        }

        public String getNombre() {
            return nombre;
        }

        public int getCodigo() {
            return codigo;
        }

        public double getSueldoBase() {
            return sueldoBase;
        }

        public int getVentasSemanales() {
            return ventasSemanales;
        }
    }
}
