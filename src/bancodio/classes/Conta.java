package bancodio.classes;

import bancodio.interfaces.IConta;

public abstract class Conta implements IConta {
	
/**Atributos**/
private static final int AGENCIA_PADRAO = 1;
private static final String CONTA_PADRAO = "Bronze";
private static final double TAXA_EMPRESTIMO = 0.40;
private static int SEQUENCIAL = 1;

protected int agencia;
protected String tipoConta;
protected int numero;
protected double saldo; 
protected double emprestimo;
protected Cliente cliente;

/**Construtores**/
public Conta(Cliente cliente, double emprestimo) {
this.agencia = Conta.AGENCIA_PADRAO;
this.tipoConta = Conta.CONTA_PADRAO;
this.numero = SEQUENCIAL++; 
this.cliente = cliente; 
this.emprestimo = emprestimo;
}

/**Métodos**/
@Override
public void sacar(double valor) {
saldo -= valor;
}

@Override
public void depositar(double valor) {
saldo += valor;
}

@Override
public void transferir(double valor, IConta contaDestino) {
this.sacar(valor);
contaDestino.depositar(valor);
}
@Override
public void emprestar(double valor) { 
valor = (saldo / TAXA_EMPRESTIMO);
emprestimo = valor;
}

/**Getters e Setters**/
public int getAgencia() {
return agencia;
}

public int getNumero() {
return numero;
}

public double getSaldo() {
return saldo;
}
public String getTipoConta() {
if (saldo >= 10000) {
return tipoConta = "Ouro";
}
if (saldo >= 5000) {
return tipoConta = "Prata";
} 
return tipoConta;
}
public void setTipoConta(String tipoConta) {
this.tipoConta = tipoConta;
}
public double getEmprestimo() { 
return emprestimo;
}


/**Impressão de dados da conta**/
protected void imprimirInfosComuns() {
System.out.println(String.format("Titular: %s", this.cliente.getNome()));
System.out.println(String.format("Categoria da Conta: %s", this.getTipoConta()));
System.out.println(String.format("Agencia: %d", this.agencia));
System.out.println(String.format("Numero: %d", this.numero));
System.out.println(String.format("Saldo: R$%.2f", this.saldo));
System.out.println(String.format("Emprestimo liberado referente ao perfil da conta: R$%.2f", this.emprestimo));
System.out.println("============================================================");
}





}
