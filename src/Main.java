import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void  holamundo() {
        System.out.println("Mira mama mi primer programa en java");

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu de Ejercicios");
            System.out.println("1. - Hola Mundo");
            System.out.println("6. - Pa Fuera");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    holamundo();
                    break;
                case 6:
                    System.out.println("Saliendo del programa... Chao");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion!=6);
    }//end main
}