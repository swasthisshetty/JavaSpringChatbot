package watsonassistant;
import java.util.*;

public class AccountService {
	private static List<Account> accounts = new ArrayList<>();
	private static List<Transaction> trans = new ArrayList<>();
	
	
	
	static {                           
		
		accounts.add(new Account( "101100", "11986789001" ));
		accounts.add(new Account("101100", "12345678902"));
		accounts.add(new Account("101100", "12346645453"));
		accounts.add(new Account("101101", "11768657874"));
		accounts.add(new Account("101101", "12348454115"));
		accounts.add(new Account("101101", "13216645456"));
	}
static {                          
		
	trans.add(new Transaction(accounts, "deposit:10000.00 ", "withdraw500.00 ", "balance:80000.00 ", "time:11.00 am "));
	trans.add(new Transaction(accounts,"deposit:20000.00 ", "withdraw:0.00 ","balance:70000.00 ", "time:1.00 pm "));
	trans.add(new Transaction(accounts,"deposit:5000.00 ", "withdraw:100.00 ","balance:60900.00 ", "time:5.00 pm "));
	trans.add(new Transaction(accounts,"deposit:20000.00 ", "withdraw:0.00 ","balance:80000.00 ", "time:11.00 am "));
	trans.add(new Transaction(accounts,"deposit:0000.00 ", "withdraw:10000.00 ","balance:40000.00 ", "time:11.00 pm "));
	trans.add(new Transaction(accounts,"deposit:2000.00 ", "withdraw:200.00 ","balance:80800.00 ", "time:3.00 pm "));
	
}
	

	public static String getAccountDetails(String cusid) {
		String output= "";
	for(int i=0; i<accounts.size();i++)
	{
		if (accounts.get(i).getCusid().equals(cusid)) {
			output+=accounts.get(i).getAccnum()+"/n";
		}
	}
	if (output.equals("")) {
		return "customer id not found";
		
	}
	else
		return output;
		
	}


public static String getTransactionDetails(String accnum) {
	String output= "";
for(int i=0; i<accounts.size();i++)
{
	if (accounts.get(i).getAccnum().equals(accnum)) {
		output+=trans.get(i).getDeposit()+trans.get(i).getWithdraw()+trans.get(i).getBalance()+trans.get(i).getDate_time();
	}
}
if (output.equals("")) {
	return "account number not found";
	
}
else
	return output;
	
}
}



