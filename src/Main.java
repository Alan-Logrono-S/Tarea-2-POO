import java.util.Scanner;

class Jugador {
    String nombre;
    String posicion;
    int edad;
    int numero;

    Jugador(String nombre, String posicion, int edad, int numero) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numero = numero;
    }

    void mostrar() {
        System.out.println("---------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Número: " + numero);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Jugadores

        System.out.print("Nombre: ");
        String n1 = sc.nextLine();
        System.out.print("Posición: ");
        String p1 = sc.nextLine();
        System.out.print("Edad: ");
        int e1 = sc.nextInt();
        System.out.print("Número: ");
        int num1 = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Jugador j1 = new Jugador(n1, p1, e1, num1);

        // Jugador 2
        System.out.print("Nombre: ");
        String n2 = sc.nextLine();
        System.out.print("Posición: ");
        String p2 = sc.nextLine();
        System.out.print("Edad: ");
        int e2 = sc.nextInt();
        System.out.print("Número: ");
        int num2 = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Jugador j2 = new Jugador(n2, p2, e2, num2);

        // Jugador 3
        System.out.print("Nombre: ");
        String n3 = sc.nextLine();
        System.out.print("Posición: ");
        String p3 = sc.nextLine();
        System.out.print("Edad: ");
        int e3 = sc.nextInt();
        System.out.print("Número: ");
        int num3 = sc.nextInt();

        Jugador j3 = new Jugador(n3, p3, e3, num3);

        j1.mostrar();
        j2.mostrar();
        j3.mostrar();

        sc.close();
    }
}