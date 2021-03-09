package bankaccount;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(157, "Jack Doe");
		
//		new BankAccount(268, "John Doe");
//		account1 = new BankAccount(349, "Jane Doe");
//		BankAccount account2 = new BankAccount(349, "Jane Doe");
//		System.out.println(account1 == account2);
//		account2 = account1;
//		System.out.println(account1 == account2);
//		
		BankAccount account2 = new BankAccount(349, "Jane Doe", 3000);
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());

		account1.deposit(1000);
		account2.deposit(2000);

		System.out.println("Balance after deposit: ");
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());

		boolean check1 =account1.withdraw(500);
		boolean check2 = account2.withdraw(6000);
		
		System.out.println("Balance after withdrawal: ");
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		System.out.println(check1);
		System.out.println(check2);

		
	}

}
