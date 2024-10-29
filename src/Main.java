import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de casos de prueba
        System.out.println("Escribe un número");
        int casos = scanner.nextInt();

        // Procesar cada caso
        System.out.println("Dame tres números");
        for (int i = 0; i < casos; i++) {
            // Leer los tres años
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            // Calcular la distancia de A y C a B
            int distanciaA = Math.abs(A - B);
            int distanciaC = Math.abs(C - B);

            // Determinar cuál año está más cerca de B
            if (distanciaA < distanciaC) {
                System.out.println("El número que esta más cerca" + A);
            } else if (distanciaC < distanciaA) {
                System.out.println("El número que esta más cerca" + C);
            } else {
                System.out.println("EMPATE");
            }
        }

        scanner.close();
    }
}
