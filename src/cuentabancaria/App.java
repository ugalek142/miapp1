package cuentabancaria;

public class App {
    public static void main(String[] args) throws Exception {
        cuentabancaria.CuentaBancaria CB = new cuentabancaria.CuentaBancaria();

        CB.depositar(1000);

        System.err.println(CB.obtenerSaldo());
    }
}