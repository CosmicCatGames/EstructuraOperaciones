/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuraoperaciones;

import java.util.Scanner;

public class EstructuraOperaciones {
    
    public static class OperacionesBasicas {
        private double resultado;

        public void Suma(double a, double b) {
            resultado = a + b;
        }

        public void Resta(double a, double b) {
            resultado = a - b;
        }

        public void Multiplicacion(double a, double b) {
            resultado = a * b;
        }

        public void Division(double a, double b) {
            if (b == 0) {
                System.out.println("Error: división entre cero");
            }
            resultado = a / b;
        }

        public void Resultado() {
            System.out.printf("Resultado: %5.5f\n", resultado);
        }
    }

    public static class Numeros {
        private OperacionesBasicas op = new OperacionesBasicas();
        private Scanner sc = new Scanner(System.in);

        public void Menu() {
            int opcion = 0;
            double a, b;

                System.out.println("Seleccione una operación:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    System.out.println("Ingrese el primer número:");
                    a = sc.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    b = sc.nextDouble();

                    if (opcion == 1) {
                        op.Suma(a, b);
                    } else if (opcion == 2) {
                        op.Resta(a, b);
                    } else if (opcion == 3) {
                        op.Multiplicacion(a, b);
                    } else if (opcion == 4) {
                        op.Division(a, b);
                    }
                    
                    op.Resultado();
                } else if (opcion != 5) {
                    System.out.println("Opción inválida");
                }
            } 
    }
}