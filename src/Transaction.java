
public class Transaction
{
	private int Index1=0;
	private int Index2=0;
	private int Index3=0;
	private int paymentArr[]=new int[5];
	private int refundArr[]=new int[5];
	private int walletArr[]=new int[5]; 
	private int id;
	//////
	public int[] returnPaymentArr()
	{
		return paymentArr;
	}
	public  int[] returnRefundArr()
	{
		return paymentArr;
	}
	public int[] returnWalletArr()
	{
		return walletArr; 
	}
	public void addPaymentTrans(int i)
	{
		id=i;
		paymentArr[Index1++]=id;
		
	}
	public void addRefundTrans(int i)
	{
		id=i;
		refundArr[Index2++]=id;
	}
	public void addWalletTrans(int i)
	{
		id=i;
		walletArr[Index3++]=id;
	}
	public int getId()
	{
		return id;
	}
}
