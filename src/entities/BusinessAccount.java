package entities;

public class BusinessAccount extends Account{ //extends cria relação de HERANÇA da classe Account para a classe BusinessAccount
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loanLimit(Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

	@Override //sobreescrevendo o método 'withdraw' na classe filha extendido da superclasse 'Account'
	public void withdraw(double amount) {
		super.withdraw(amount); //taxa de 5.0 por saque
		balance -= 2.0; //mais a taxa de 2.0 por ser conta empresarial
	}
	
	@Override
	public String toString() {
		return "BusinessAccount [loanLimit=" + loanLimit + "]";
	}

}
