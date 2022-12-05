
public class User
{
	private String email;
	private String username;
	private String password;
	private String mobileNumber;
	private paymentMethod payment;
	private String creditCardNum;
	private int transactionCounter;
	private Wallet w;
///
	public void consumeFromWallet(Wallet w)
	{
		
	}
    public void requestRefund(double Fund)
    {
		
    }
	public int getPaymentMethod()
	{
		return 0;
		
	}
	public int getTransactionCount()
	{
		return 0;
	}

}
