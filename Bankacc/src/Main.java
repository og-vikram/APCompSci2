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
			System.out.println("Enter ur username n password big man");
			String user = bot.nextLine();
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
			System.out.println("No accounts here big man");
		}
	}

	public void create() {
		if (BankAccount.numAcc <= 4) {
			System.out.println("Enter a username, password, and deposit amount");
			String username = bot.nextLine();
			int password = bot.nextInt();
			double deposit = bot.nextDouble();
			bot.nextLine();
			bAccounts[BankAccount.numAcc] = new BankAccount(username, deposit, password);
			System.out.println( "Account Created");
		} else {
			System.out.println("Its full bro u cant make more accts");
		}
	}

	public void delete() {
		System.out.println("Enter your username and password");
		String username = bot.nextLine();
		int password = bot.nextInt();
		bot.nextLine();
    for(int i = 0;i<BankAccount.numAcc;i++){
		if (username == bAccounts[i].getName() && password == bAccounts[i].getPinNum()) {
        bAccounts[i]=null;
		} else {
			System.out.println("Sorry we cannot find your account");
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
			System.out.println("\nSuccessfully logged in!\n1.Check Baance\n2.Deposit Money\n3.Withdraw Money\n4.Exit");
			choice = bot.nextLine();
			if (choice.equals("1")) {
				System.out.println(x.getBalance());
			} else if (choice.equals("2")) {
				deposit(x);
			} else if (choice.equals("3")) {
				withdraw(x);
			}
		}
	}

	public void deposit(BankAccount bank) {
		System.out.println("Enter ur deposit amt");
		double dep = bot.nextDouble();
		bank.deposit(dep);
	}

	public void withdraw(BankAccount bank) {
		System.out.println("Enter your withdraw amount");
		double witdraw = bot.nextDouble();
		if (bank.getIsLocked() == true) {
			System.out.println("Your account is locked, please deposit");
		} else {
			bank.withdraw(witdraw);
		}
	}

	private void printHeader() {
		System.out.println(
				"\nWelcome to the bread bank bruh we sell bread we sell loafs\nEnter the number of wat u tryn do");
		System.out.print("1.Login to existing account\n2.Create Account\n3.List Accounts\n4.Delete Account\n5.Exit\n");

	}
}