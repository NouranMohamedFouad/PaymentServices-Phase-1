
public class realRefund implements Refund
{
	private Wallet wallet;
	
	public realRefund()
	{
		
	}
	@Override
	public void approveRefund(int amount,Wallet w,int id) 
	{
		System.out.println("approved refund for transaction id= "+ id);
		wallet=w;  
		wallet.addAmount(amount);  
	}
}
