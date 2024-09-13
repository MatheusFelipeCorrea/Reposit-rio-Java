public class Conta {
private String Nconta;
private String CPF;
private double saldo;
private double limite;

public Conta(String Nconta, String CPF, double saldo, double limite){
    this.Nconta = Nconta;
    this.CPF = CPF;
    this.saldo = saldo;
    this.limite = limite;
}

public String getNconta(){
    return Nconta;
}

public String getCPF(){
    return CPF;
}

public double getSaldo(){
    return saldo;
}

public double getLimite(){
    return limite;
}



public boolean sacar(double valor){
    if(valor <= this.saldo + this.limite){
        this.saldo -= valor;
        return true;
    }else{
        System.out.println("Saque não realizado, devido a saldo e limite insuficiente");
        return false;
    }
}

public void depositar(double valor){
    if (saldo < 0){
        double taxa = saldo * 0.03;
        saldo += valor - taxa;
    }else{
        saldo += valor;
    }
}

public double AtualizarSaldo(){
    return saldo;
}

public String Mostrarconta(){
    return Nconta;
}

public	String	MostrarCPF(){
    return CPF;
}

public void setLimite(double limite){
    this.limite = limite;
}
}