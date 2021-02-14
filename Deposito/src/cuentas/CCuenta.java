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
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setCuenta(String cuenta)
    {
        this.cuenta=cuenta;
    }
    public String getCuenta()
    {
        return this.cuenta;
    }
    public void setSaldo(double saldo)
    {
        this.saldo=saldo;
    }
    public double getSaldo()
    {
        return this.saldo;
    }
    public void setTipo(double tipo)
    {
        this.tipoInteres=tipo;
    }
    public double getTipo()
    {
        return this.tipoInteres;
    }
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

