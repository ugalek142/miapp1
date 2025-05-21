package cuentabancaria;

public class App {
    public static void main(String[] args) throws Exception {
        cuentabancaria.CuentaBancaria CB = new cuentabancaria.CuentaBancaria();
        cuentabancaria.CuentaBancaria CC = new cuentabancaria.CuentaBancaria();

        CB.depositar(1000);
        CB.retirar(500);
        CB.transferir(CC, 250);

        System.err.println(CB.obtenerSaldo());
    }
}