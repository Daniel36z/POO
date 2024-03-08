package com.banco.app;

import com.banco.dominio.CuentaBancaria;

public class AppBanco {
    public static void main(String[] args) {
        CuentaBancaria miCuenta  = new CuentaBancaria();
        CuentaBancaria cuenta2  = new CuentaBancaria();
        miCuenta.Consignar(100);
        miCuenta.Transferir(97,cuenta2);
        miCuenta.MostrarSaldo();
        cuenta2.MostrarSaldo();


    }
}



// cometario un comentario  nnbbbnvmmm