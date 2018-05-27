
public class CriaConta {

    public static void main(String[] args) {
       Conta primeiraCoanta = new Conta();
       primeiraCoanta.saldo=(double) 200;
       primeiraCoanta.agencia = 20;
       primeiraCoanta.numero = 0001;
       primeiraCoanta.titular = "Wenendy Silva";
       
       Conta segundaConta = new Conta();
       segundaConta.saldo = (double) 50;
       
       System.out.printf("Conta "+ primeiraCoanta.titular, primeiraCoanta.saldo);
       System.out.println("Segunda "+ segundaConta.saldo);
       
    }

}
