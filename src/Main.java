//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // EJERCICIO #11
        // Contar del 1 al 100 de uno en uno

        System.out.println("========== USANDO FOR ==========");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("========== USANDO DO WHILE ==========");

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 100);

    }
}