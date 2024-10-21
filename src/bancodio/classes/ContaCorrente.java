package bancodio.classes;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente, double emprestimo) {
		super(cliente, emprestimo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

}
