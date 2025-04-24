import java.util.Scanner;

class Empleado{
    String nombre;
    String cargo;
    double salario;
    String ingreso;

    Empleado(String nombre, String cargo, double salario, String ingreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.ingreso = ingreso;
    }

    void mostrar() {
        System.out.println("---------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Fecha de Ingreso: " + ingreso);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Jugadores

        System.out.print("Nombre: ");
        String n1 = sc.nextLine();
        System.out.print("Cargo: ");
        String p1 = sc.nextLine();
        System.out.print("Salario: ");
        double e1 = sc.nextDouble();
        System.out.print("Fecha de Ingreso (dia/mes/año): ");
        String num1 = sc.nextLine();
        sc.nextLine(); // limpiar buffer

        Empleado j1 = new Empleado(n1, p1, e1, num1);

        // Jugador 2
        System.out.print("Nombre: ");
        String n2 = sc.nextLine();
        System.out.print("Cargo: ");
        String p2 = sc.nextLine();
        System.out.print("Salario: ");
        double e2 = sc.nextDouble();
        System.out.print("Fecha de Ingreso (dia/mes/año): ");
        String num2 = sc.nextLine();
        sc.nextLine(); // limpiar buffer

        Empleado j2 = new Empleado(n2, p2, e2, num2);

        // Jugador 3
        System.out.print("Nombre: ");
        String n3 = sc.nextLine();
        System.out.print("Cargo: ");
        String p3 = sc.nextLine();
        System.out.print("Salario: ");
        double e3 = sc.nextDouble();
        System.out.print("Fecha de Ingreso (dia/mes/año): ");
        String num3 = sc.nextLine();
        sc.nextLine();

        Empleado j3 = new Empleado(n3, p3, e3, num3);

        j1.mostrar();
        j2.mostrar();
        j3.mostrar();

        sc.close();
    }
}