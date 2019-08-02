/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Previo;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA12
 */
public class cuenta {
    

    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //Constructor por defecto
    public cuenta() {
    }

    //Constructor con parámetros
    public cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    //Constructor copia
    public cuenta(final cuenta C) {
        nombre = C.nombre;
        numeroCuenta = C.numeroCuenta;
        tipoInteres = C.tipoInteres;
        saldo = C.saldo;
    }

    //getters y setters
    public void setNombre(String N) {
        nombre = N;
    }

    public void setNumeroCuenta(String c) {
        numeroCuenta = c;
    }

    public void setTipoInteres(double i) {
        tipoInteres = i;
    }

    public void setSaldo(double s) {
        saldo = s;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    //método ingreso
    public boolean ingreso(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }

    //método reintegro
    public boolean reintegro(double n) {
        boolean reintegroCorrecto = true;
        if (n < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }

    //método transferencia
    public boolean transferencia(cuenta c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            reintegro(n);
            c.ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }
}