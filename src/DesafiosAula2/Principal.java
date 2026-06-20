package DesafiosAula2;
// Testando ContaBancaria
public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Gustavo";
        conta.setNumeroConta(1234);
        conta.setSaldo(1000);

        System.out.println(conta.titular);
        System.out.println(conta.getNumeroConta());
        System.out.println(conta.getSaldo());
    }
}

