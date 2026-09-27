package Exercises;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this(titular, 0.0);
    }

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial < 0 ? 0.0 : saldoInicial;
    }

    public String getTitular() {
        return this.titular;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public boolean depositar(double monto) {
        if (monto <= 0) {
            return false;
        }
        this.saldo += monto;
        return true;
    }

    public boolean retirar(double monto) {
        if (monto <= 0 || monto > this.saldo) {
            return false;
        }
        this.saldo -= monto;
        return true;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{titular=" + titular + ", saldo=" + saldo + "}";
    }
}
