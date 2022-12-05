
public class User
{
	private String email;
	private String username;
	private String password;
	private String mobileNum;
	//private String creditCardNum ;
	private int transactionCounter=0;
	private Wallet wallet;
	private paymentMethod payment;
	private Refund refund;
    ///////////////////////////
	public User()
	{
	}
	public User(Wallet w)
	{
		wallet=w;
	}
	///////////////////////////
	public void consumeFromWallet(Wallet w,int amount)
	{
		wallet=w;
		wallet.removeAmount(amount);
	}
	//////////////////////////
    public void askForRefund(int amount,Refund f,int transationId)
    {
		refund=f;
		refund.approveRefund(amount, wallet,transationId); 
    }
    ///////////////////////////
	public int getPaymentMethod()
	{
		return 0; 
	}
	////////////////////////////
	public void setTransactionCount(int counter)
	{
		transactionCounter=counter; 
	}
	////////////////////////////
	public void setEmail(String e)
	{
		email=e;
	}
	////////////////////////////
	public void setUsername(String uname)
	{
		username=uname;
	}
    ////////////////////////////
	public void Setpassword(String pass)
	{
		password=pass;
	}
	////////////////////////////
	public void setPaymentAmount(int amount)
	{
		
	}
	////////////////////////////
	public void setMobileNum(String num)
	{
		mobileNum=num;
	}
	///////////////////////////
	public String getEmail()
	{
		return email; 
	}
	///////////////////////////
	public String getPassword()
	{
		return password; 
	}
	///////////////////////////
	public String getMobileNum()
	{
		return mobileNum; 
	}
	//////////////////////////
	public String getUsername()
	{
		return username; 
	}
	////////////////////////////
	public int getTransactionCount()
	{
		return transactionCounter; 
	}
	///////////////////////////
	public void addTransaction()
	{
		setTransactionCount(getTransactionCount()+1);
	}
	////////////////////////////
	/*public Wallet getWallet()
	{
		return wallet; 
	}
	public void getApproval()
	{
	}  */
	
}
