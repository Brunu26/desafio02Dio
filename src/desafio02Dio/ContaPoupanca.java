package desafio02Dio;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("---- Extrato conta Poupan�a ----");
		super.imprimirInfosComuns();
		
	}


	
	

	
}
