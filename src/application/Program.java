package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		// TESTES COM SOBREPOSIÇÃO @Override (no método withdraw) 
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0); //regra de negócio: taxa 5.0 por saque 
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0); //regra de negócio: não possui para sacar
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0); //regra de negocio: herdou a taxa de 5.0 da super classe + taxa de 2.0 por ser conta empresarial
		System.out.println(acc3.getBalance());
		
		
	}

}
