package cuentabancaria;

public class CuentaBancaria {
    private int saldo;
    // Método para realizar un depósito
    public void depositar(int cantidad) {
        saldo += cantidad;
    }

    // Método para realizar un retiro
    public void retirar(int cantidad) {
        if (saldo > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    // Método para realizar una transferencia
    public void transferir(CuentaBancaria cuentaDestino, int cantidad) {
        retirar(cantidad);
        cuentaDestino.depositar(cantidad);
    }
    
    // Método para obtener infrmación sobre el saldo
    public int obtenerSaldo() {
        return saldo;
    }
}