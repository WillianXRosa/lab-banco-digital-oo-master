package bancodio.main;

import bancodio.classes.Cliente;
import bancodio.classes.Conta;
import bancodio.classes.ContaCorrente;
import bancodio.classes.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton, 0);		
		cc.getTipoConta();
		cc.getEmprestimo();
		
		Conta poupanca = new ContaPoupanca(venilton, 0);		
		
		cc.depositar(10000);
		cc.transferir(100, poupanca);
		cc.emprestar(0);	
		cc.imprimirExtrato();
		
		poupanca.depositar(2000);		
		poupanca.emprestar(0);
		poupanca.imprimirExtrato();
	}
  


}
