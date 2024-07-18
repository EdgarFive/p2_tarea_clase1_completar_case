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


        //Area de definiciones================
        int opcion;
        int num1;
        int num2;
        int temp;
        //====================================


        do {
            System.out.println("Menu de Ejercicios");
            System.out.println("1. - Hola Mundo\n2. - Suma de dos números.\n3. - El número es par o impar.\n4. - Obtener el FACTORIAL de un número.\n5. - Obtener la TABLA de MULTIPLICAR de un número.");
            System.out.println("6. - Pa Fuera");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    holamundo();
                    System.out.println("\n=============================================\n");
                    break;

                case 2:
                    System.out.println("Ingresa un número:");
                    num1 = scanner.nextInt();
                    System.out.println("Ingresa otro número:");
                    num2 = scanner.nextInt();
                    int resul;
                    resul   =num1 + num2;
                    System.out.println("El resultado de las suma de \""+num1+"\" y \""+num2+"\" es: " + resul);
                    System.out.println("\n=============================================\n");
                    break;

                case 3:
                    System.out.println("Ingresa un número:");
                    num1 = scanner.nextInt();
                    num2 = num1 % 2;
                    if (num2 == 0){
                        System.out.println("El número es par.\n");
                        scanner.nextLine();
                    }else{
                        System.out.println("El número no es par.\n");
                        scanner.nextLine();
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 4:
                    System.out.println("Ingrese un número para obtener su factorial:");
                    num1 = scanner.nextInt();
                    int temp2;
                    temp2 = num1;

                    for(int ii= 1;ii <= num1; ii++){
                        temp2 = temp2*ii;
                    }

                    System.out.println("El factorial de "+num1+" es: "+temp2);
                    System.out.println("\n=============================================\n");
                    break;

                case 5:
                    System.out.println("Ingrese un número para obtener su tabla de multiplicar:");
                    num1 = scanner.nextInt();
                    int result;
                    for(int ii = 0; ii <= 10; ii++) {
                        result = num1 * ii;
                        System.out.println(num1+" * "+ ii +" = "+result);
                    }

                    System.out.println("\n\n");

                    for(int ii = 10; ii >= 0; ii--) {
                        result = num1 * ii;
                        System.out.println(num1+" * "+ ii +" = "+result);
                    }
                    System.out.println("\n=============================================\n");
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