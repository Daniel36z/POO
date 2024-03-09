package com.banco.app;

import com.banco.dominio.CuentaBancaria;

public class AppBanco {
    public static void main(String[] args) {
        CuentaBancaria miCuenta  = new CuentaBancaria();
        CuentaBancaria cuenta2  = new CuentaBancaria();
        miCuenta.Consignar(300);
        miCuenta.Transferir(80,cuenta2);
        miCuenta.MostrarSaldo();
        cuenta2.MostrarSaldo();
    }
}


