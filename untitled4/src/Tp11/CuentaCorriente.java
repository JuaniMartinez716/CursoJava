package Tp11;

public class CuentaCorriente {

    public void depositar(Cliente cliente, double saldo){
        cliente.setSaldo(cliente.getSaldo() + saldo);
        System.out.println("Saldo actual: " + cliente.getSaldo());
    }

    public void retirar(Cliente cliente, double saldo){
        cliente.setSaldo(cliente.getSaldo() - saldo);
        System.out.println("Saldo actual: " + cliente.getSaldo());
    }

    public void transferencia(Cliente cliente1,Cliente cliente2, double saldo){
        cliente1.setSaldo(cliente1.getSaldo()- saldo);
        cliente2.setSaldo(cliente2.getSaldo()+saldo);
        System.out.println("Se transfirio la cantidad de: $"+saldo+" a la cuenta "+cliente2+" desde la cuenta "+cliente1);
    }


}
