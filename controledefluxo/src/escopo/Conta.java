package escopo;

public class Conta{
    
    double saldo = 100.0d;

    public void sacar(Double valor){
         if(saldo != 0 && saldo >= valor) saldo = saldo - valor;
    }

    public void imprimirSaldo(){
        System.out.println(saldo);
    }

    public double calcularDividaExponencial(){
        double valorParcela = 50.0d;
        double valorMontante = 0.0d;
            for(int x = 1; x <= 5; x++){
                double valorCalculado = valorParcela * x;
                valorMontante = valorMontante + valorCalculado;
            }

        return valorMontante;
    }
}
