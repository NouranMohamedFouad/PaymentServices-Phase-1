
public class Admin implements Refund
{
	private Service service;
	private realRefund refund;
	private Discount discount;
	private Transaction transaction;
	//////
	public Admin(Transaction t) 
	{
	    refund=new realRefund();
	    transaction=t;  
	} 
	@Override 
	public void approveRefund(int amount,Wallet w,int id)
	{
		if(checkRefundTransaction(id))
		{
			refund.approveRefund(amount,w,id);   
			transaction.addRefundTrans(id);  
		}
		else
		{
			System.out.println("the transaction is not available ");
		}
	}
	public void addDisc(Discount d)
	{
		
	}
	public void listAllPaymentT()
	{
		int arr[]=transaction.returnPaymentArr();
		for(int i=0;i<arr.length;i++)
		{
			 System.out.println(arr[i]);	   
		} 
	}
	public void listAllRefundT()
	{
	
		int arr[]=transaction.returnRefundArr();
		for(int i=0;i<arr.length;i++)
		{
			 System.out.println(arr[i]);	   
		}
	}
	public void listAllWalletT()
	{
		int arr[]=transaction.returnWalletArr();
		for(int i=0;i<arr.length;i++)
		{
			 System.out.println(arr[i]);	   
		}
	}
	public void addProvider(serviceProvider s)
	{
		
	}
	public boolean checkRefundTransaction(int id)
	{
		boolean check=false;
		int arr[]=transaction.returnPaymentArr();
		for(int i=0;i<arr.length;i++)
		{ 
			if(arr[i]==id)
			{
				check=true;
				break;
			}
		} 
		return check;
	}	
}
