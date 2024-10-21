package bancodio.classes;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente, double emprestimo) {
		super(cliente, emprestimo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

		
}
