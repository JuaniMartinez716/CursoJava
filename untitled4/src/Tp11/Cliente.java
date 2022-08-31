package Tp11;

public class Cliente {

    private String nombreTitular;
    private double saldo;
    private long numeroCuenta;

    public Cliente(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public String getNombreTitular(){
        return nombreTitular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombreTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
