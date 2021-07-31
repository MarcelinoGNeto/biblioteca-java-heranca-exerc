package entities;

public class SavingsAccount extends Account{ //extends cria rela��o de HERAN�A da classe Account para a classe SavingsAccount

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override //sobreescrevendo o m�todo 'withdraw' na classe filha extendido da superclasse 'Account'
	public void withdraw(double amount) {
		balance -= amount; //n�o cobra taxa por saque
	}

}