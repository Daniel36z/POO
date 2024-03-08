package com.banco.dominio;

public class CuentaBancaria {

    //Atributos
    public String numero;
    public Persona pripietario;
    public double saldo;
    public double tasa_Interes;
    public Banco banco;
    public String tipo;


    //Métodos
    public void Consignar(int valorAConsignar){
        this.saldo = this.saldo + valorAConsignar;
    }

    public boolean Retirar(int valorARetirar){
        if (valorARetirar<= this.saldo){
            this.saldo -= valorARetirar;
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
            return false;
        }

    }

    public boolean Transferir(int valorATransferir, CuentaBancaria otraCuenta){
        if (valorATransferir <= this.saldo){
            otraCuenta.Consignar(valorATransferir);
            this.Retirar(valorATransferir);
        }

        else{
            System.out.println("no hay suficiemtes fondos");
        }
        return false;
    }

    public void MostrarSaldo(){
        System.out.println("el saldo es: " + this.saldo);
    }



}
