package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Calculadora {
    public static boolean control = true; // Se define el booleano para hacer el ciclo while
    public static void main(String[] args) {
        System.out.println("Empiece con sus cálculos:");
        Scanner inputNum1 = new Scanner(System.in); // Input que capturara los numeros para el calculo
        Scanner inputOperacion = new Scanner(System.in); // Captura la operacion deseada
        Scanner inputNum2 = new Scanner(System.in);
        double num1 = inputNum1.nextDouble();
        String operacion = inputOperacion.nextLine();
        double num2 = inputNum2.nextDouble();
        double resultado;
        Operaciones op = new Operaciones(num1,num2); // Se crea un objeto de la clase operaciones, teniendo como parametros los numeros capturados de parte del usuario
        
        // bucle para efectuar cuantas operaciones se deseen
        while(control == true) {
            if(operacion.equals("+")) {
                resultado = op.sumar(); // Se usan los metodos de la clase operaciones para los calculos
                op.setOp1(resultado); // Seteamos resultado como el primer parametro del objeto (logica aplicada para guardar el   resultado en memoria)
                System.out.println(String.format("%.2f", resultado)); // Se formatea el resultado para mostrar dos decimales
            } else if(operacion.equals("-")) {
                resultado = op.restar();
                op.setOp1(resultado);
                System.out.println(String.format("%.2f", resultado));
            } else if(operacion.equals("*")) {
                resultado = op.multiplicar();
                op.setOp1(resultado);
                System.out.println(String.format("%.2f", resultado));
            } else if(operacion.equals("/")) { 
                if(op.getOp2() == 0) { // Se crea la excepcion al tener 0 de divisor
                    System.out.println("no existe la division entre 0");
                    control = false; // se detiene el bucle debido a operacion invalida
                } else {
                    resultado = op.dividir();
                    op.setOp1(resultado);
                    System.out.println(String.format("%.2f", resultado));
                }
            } else if(operacion.equals("%")) {
                if(op.getOp2() == 0) { // Se crea la excepcion al tener 0 de divisor
                    System.out.println("El divisor no puede ser 0");
                    control = false;
                } else {
                    resultado = op.modulo();
                    op.setOp1(resultado);
                    System.out.println(String.format("%.2f", resultado)); 
                }
            } else { // Se crea la excepcion al ingresar una operacion invalida
                System.out.println("No ha digitado una operacion valida");
                control = false;
            }
            if (control == true) { // Se verifica control para saber si se debe seguir capturando informacion o no
                operacion = inputOperacion.nextLine(); // Se captura la siguiente operacion
                op.setOp2(inputNum2.nextDouble()); // Se captura el siguiente operando
            }
        }
    }
}
