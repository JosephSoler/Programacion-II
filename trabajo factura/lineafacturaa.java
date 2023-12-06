

import java.util.InputMismatchException;
import java.util.Scanner;

public class lineafacturaa {

public static void main(String[] args) {
    System.out.printf("**************************");
    System.out.println("");
    System.out.printf("          Menu");
    System.out.println("");
    System.out.printf("**************************");

        Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;

    while (!salir) {
        System.out.println("");
        System.out.println("1 para sacos abono");

        System.out.println("2 para rastrillo");

        System.out.println("3 para palas");

        System.out.println("4. Salir");

        try {

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

    switch (opcion) {

        case 1:
            System.out.println("Ingrese la cantidad de sacos de abono que llevara");
            System.out.println("");
            System.out.println("Cada cada saco de abono cuesta $80");
            System.out.println("");
            double cantidadArticulos = sn.nextDouble();
            double precio=80;

            break;
        case 2:
            System.out.println("Ingrese la cantidad de rastrillos que llevara");
            System.out.println("");
            System.out.println("Cada rastrillo cuesta $38");
            System.out.println("");
            double precio1 =38;

            break;
        case 3:
            System.out.println("Ingrese la cantidad de palas que llevara");
            System.out.println("");
            System.out.println("Cada pala tiene un precio de $45");
            System.out.println("");
            double precio2=45;

            break;
        case 4:
            salir = true;

            break;
                default:
                    System.out.println("Solo números entre 1 y 4");
                }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                }
            }
        }
    }
