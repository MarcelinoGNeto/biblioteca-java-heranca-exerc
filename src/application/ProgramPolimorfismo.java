package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramPolimorfismo {

	public static void main(String[] args) {

		// TESTES POLIMORFISMO (no método withdraw) 
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

		x.withdraw(50.0); //regra de negócio: taxa 5.0 por saque
		y.withdraw(50.0); //regra de negócio: sem taxa para saque
		
		System.out.println(x.getBalance()); //945.0
		System.out.println(y.getBalance()); //950.0
		
		//Polimorfismo permite comportamento diferente da mesma variável em classes diversas, cada uma de acordo com sua regra
		
		
	}

}
