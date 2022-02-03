package watsonassistant;


public class Account {
	
	private String cusid;
	private String accnum;
	
	
	public String getCusid() {
		return cusid;
	}


	public void setCusid(String cusid) {
		this.cusid = cusid;
	}


	public String getAccnum() {
		return accnum;
	}


	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}


	public Account(String cusid, String accnum) {
		super();
		this.cusid = cusid;
		this.accnum = accnum;
	}


	public Account() {
		// TODO Auto-generated constructor stub
	} 
}