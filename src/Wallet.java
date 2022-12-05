
public class Wallet implements paymentMethod
{
	private int amount=0;

	@Override
	public void pay()
	{
		// TODO Auto-generated method stub
	}
	public void addAmount(int a)
	{
		 amount=amount+a;
	}
	public void removeAmount(int a)
	{
		amount=amount-a;
	}	
	public void setAmount(int a)
	{
		amount=a;
	}
	public int getAmount()
	{
		return amount; 
	}
	
}
