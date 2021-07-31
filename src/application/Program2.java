package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0); //estanciando a classe Account no programa (classe principal)
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING (//Super Classe 'Account' recebendo os objetos das classes herdeiras) 
		Account acc1 = bacc; 
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		//DOWNCASTING (//As subclasses 'BusinessAccount' e 'SavingsAccount' recebendo objetos da Super classe )
		
		BusinessAccount acc4 = (BusinessAccount)acc2; //(BusinessAccount) casting para isso � necess�rio fazer o (down)casting
		acc4.loanLimit(100.0);
		
/* - fazendo o casting o programa n�o identifica automaticamente o erro, somente apos rodar.
 
		BusinessAccount acc5 = (BusinessAccount)acc3; // Neste o casting for�a a IDE aceitar a associa��o das classes, mesmo acc3 n�o sendo instanciado
		
		para n�o correr risco de erro, a soluca��o de teste abaixo foi proposta para verificar se as classes est�o em associa��o ou heran�a
*/
		if (acc3 instanceof BusinessAccount) { //verifica se acc3 � instancia da classe BusinessAccount
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loanLimit(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {//verifica se acc3 � instancia da classe SavingsAccount
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		
	}

}
