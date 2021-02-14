/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author eduar
 */
public class Main {
    
    /**
     *
     */
    public static CCuenta cuenta1;
    
    /**
     *
     * @param args argumentos 
     */
    public static void main(String[] args) {
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        operativa_cuenta(0);
    }

    /**
     *
     * @param cantidad que se pasa para la operativa
     */
    public static void operativa_cuenta(float cantidad)
    {
        /**
     * Método que ejecuta operaciones en la cuenta
    *   */
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
           
    }
}