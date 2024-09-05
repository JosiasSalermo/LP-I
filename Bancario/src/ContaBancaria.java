public class ContaBancaria {

    String titular;
    double saldo;

    double getSaldo(){
        return saldo;
    }

    boolean depositaConta(double d){
       if(d > 0){
           saldo = saldo + d;
           return true;
       }
       return false;
    }
}
