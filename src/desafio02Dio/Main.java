package desafio02Dio;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		Cliente c1 = new Cliente("Bruno");
		Cliente c2 = new Cliente("Ana");
		
		Conta cc = new ContaCorrente(c1);
		
		cc.depositar(500);
		Conta cp = new ContaPoupanca(c1);
		Conta cp1 = new ContaPoupanca(c2);
		
		cc.transferir(100, cp);
		
		cc.sacar(1000);
		
		cp.transferir(500, cp1);
		
				
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		cp1.imprimirExtrato();
		cp.transferir(50, cp1);
		cp.imprimirExtrato();
		cp1.imprimirExtrato();

		
	}

}
