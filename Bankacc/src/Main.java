import java.util.Scanner;

public class Main {
	static Scanner bot = new Scanner(System.in);
	static BankAccount[] bAccounts = new BankAccount[5];
	
	public static void main(String[] args) {

		Scanner bot = new Scanner(System.in);
		Main atm = new Main();
		atm.mainMenu();
	}
	public void mainMenu() {
		String choice = "";
		while (!choice.equals("5")) {
			printHeader();
			choice = bot.nextLine();
			switch(choice){
			case "1": 
				login();
				break;
			case "2":
				create();
				break;
			case "3":
				list();
				break;
			case "4":
				delete();
				break;		
			}
		}	
	}
	public void login() {
		if (BankAccount.numAcc > 0) {
			System.out.println("Enter ur username big man");
			String user = bot.nextLine();
			System.out.println("Enter ur password");
			int password = bot.nextInt();
			bot.nextLine();
			for (int i = 0; i < bAccounts.length; i++) {
				if (bAccounts[i] != null) {
					if (user.equals(bAccounts[i].getName()) && password == bAccounts[i].getPinNum()) {
						int j = BankAccount.numAcc;
						loggedin(bAccounts[i]);
					}
				}
			}
		} else {
			System.out.println("There are no accounts here, make an account first big man");
		}
	}
	
	public void create() {
		if (BankAccount.numAcc <= 4) {
			System.out.println("Enter a username");
			String username = bot.nextLine();
			System.out.println("Enter a password");
			int password = bot.nextInt();
			System.out.println("Enter a deposit amount");
			double deposit = bot.nextDouble();
			bot.nextLine();
			bAccounts[BankAccount.numAcc] = new BankAccount(username, deposit, password);
			System.out.println( "Account Created");
		} else {
			System.out.println("Its full bro u cant make more accts");
		}
	}

	public void delete() {
		System.out.println("Enter the username of the account you want to delete");
		String username = bot.nextLine();
		System.out.println("Enter the password");
		int pin = bot.nextInt();
		bot.nextLine();
		
		boolean delete = false;
		for(int i = 0; i<BankAccount.numAcc; i++){
			if(bAccounts[i]!=null && bAccounts[i].getName().equals(username) && bAccounts[i].getPinNum()==pin){}{
				System.out.println("Account deleted");
				delete = true;
				bAccounts[i] = null;
				BankAccount.numAcc--;
				break;
			}
		}
			if(!delete){
				System.out.println("An account with those details does not exist");
			}
			else{
				BankAccount[] bankAcct = new BankAccount[5];
				int inc = 0;
				for(int x = 0; x<BankAccount.numAcc; x++){
					for(int y = inc; y<bAccounts.length; y++){
						if(bAccounts[y]!=null){
							bankAcct[x]=bAccounts[y];
							inc = y + 1;
							break;
						}
					}
				}
			}
				
		}
	
	

	public void list() {
		for (int i = 0; i < BankAccount.numAcc; i++) {
			System.out.println(bAccounts[i].getName());
		}
	}

	public void loggedin(BankAccount x) {
		String choice = "";
		while (!choice.equals("4")) {
			System.out.println("\n1.Check Balance\n2.Deposit Money\n3.Withdraw Money\n4.Exit");
			choice = bot.nextLine();
			switch (choice){
			case "1":
				System.out.println(x.getBalance());
				break;
			case "2":
				deposit(x);
				break; 
			case "3":
				withdraw(x);
				break;
			}
		}
	}

	public void deposit(BankAccount bank) {
		System.out.println("Enter ur deposit amt");
		double dep = bot.nextDouble();
		bot.nextLine();
		bank.deposit(dep);
		System.out.println("Your balance is now " + bank.getBalance());
	}

	public void withdraw(BankAccount bank) {
		System.out.println("Enter your withdraw amount");
		double witdraw = bot.nextDouble();
		bot.nextLine();
		if (bank.getIsLocked() == true) {
			System.out.println("Your account is locked, please deposit");
		} else {
			bank.withdraw(witdraw);
			System.out.println("Your balance is now "+ bank.getBalance());
		}
	}

	private void printHeader() {
		System.out.println(
				"\nWelcome to the bread bank bruh we sell bread we sell loafs\nEnter the number of wat u tryn do");
		System.out.print("1.Login to existing account\n2.Create Account\n3.List Accounts\n4.Delete Account\n5.Exit\n");

	}
}