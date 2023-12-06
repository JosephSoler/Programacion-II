package Simpletron;

import java.util.Scanner;

public class SimpletronSimulator {
    public static void main(String[] args) {
        int[] memory = new int[100];

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("*** Bienvenido a Simpletron! ***");
        System.out.println("*** Por favor, introduzca en su programa una instruccion ***");
        System.out.println("*** (o palabra de datos) a la vez. Yo le mostrare ***");
        System.out.println("*** el numero de ubicacion y un signo de interrogacion (?) ***");
        System.out.println("*** Entonces usted escribira la palabra para esa ubicacion. ***");
        System.out.println("*** Teclee -9999 para dejar de introducir su programa. ***");

        int instructionCounter = 0;
        int number;

        do {
            System.out.printf("%02d ? ", instructionCounter);
            number = inputScanner.nextInt();
            if (number != -9999) {
                memory[instructionCounter] = number;
                instructionCounter++;
            }
        } while (number != -9999);

        int accumulator = 0;
        int instructionRegister;
        int operationCode;
        int operand;
        instructionCounter = 0;

        while (instructionCounter < 100) {
            instructionRegister = memory[instructionCounter];
            operationCode = instructionRegister / 100;
            operand = instructionRegister % 100;

            switch (operationCode) {
                case 10:
                    System.out.print("Ingrese un numero: ");
                    memory[operand] = inputScanner.nextInt();
                    break;
                case 11:
                    System.out.println("Escribe: " + memory[operand]);
                    break;
                case 20:
                    accumulator = memory[operand];
                    break;
                case 21:
                    memory[operand] = accumulator;
                    break;
                case 30:
                    accumulator += memory[operand];
                    break;
                case 31:
                    accumulator -= memory[operand];
                    break;
                case 32:
                    if (memory[operand] != 0) {
                        accumulator /= memory[operand];
                    } else {
                        System.out.println("*** Intento de dividir entre cero ***");
                        System.out.println("*** La ejecucion de Simpletron se termino en forma anormal ***");
                        System.exit(1);
                    }
                    break;
                case 33:
                    accumulator *= memory[operand];
                    break;
                case 40:
                    instructionCounter = operand;
                    break;
                case 41:
                    if (accumulator < 0) {
                        instructionCounter = operand;
                    }
                    break;
                case 42:
                    if (accumulator == 0) {
                        instructionCounter = operand;
                    }
                    break;
                case 43:
                    // Vaciado de la computadora
                    System.out.println("\n*** Vaciado de la computadora ***");
                    System.out.println("Registro de Acumulador: " + accumulator);
                    System.out.println("Contador de Instrucciones: " + instructionCounter);
                    System.out.println("Contenido de Memoria:");

                    for (int i = 0; i < memory.length; i++) {
                        System.out.printf("%02d: %d%n", i, memory[i]);
                    }
            }
            instructionCounter++;
        }

        inputScanner.close();
    }
}
