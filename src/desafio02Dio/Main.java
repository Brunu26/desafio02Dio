package desafio02Dio;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		Cliente c1 = new Cliente("Bruno");
		Cliente c2 = new Cliente("Ana");
		
		Conta cc = new ContaCorrente(c1);
		
		cc.depositar(56623);
		Conta cp = new ContaPoupanca(c1);
		Conta cp1 = new ContaPoupanca(c2);
		
		cc.transferir(6231, cp);
		
		cp.transferir(500, cp1);
		
				
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		cp1.imprimirExtrato();

		
	}

}
