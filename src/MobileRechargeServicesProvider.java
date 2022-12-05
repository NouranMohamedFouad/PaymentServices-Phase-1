
public class MobileRechargeServicesProvider extends serviceProvider
{
	
	public MobileRechargeServicesProvider()
	{
	}
	@Override
	public  void add(String s,Iform f)
	{
		form=f;
		setName(s);
		System.out.println(form.create());  

	}
	@Override
	public  void chooseProvider()
	{
		System.out.println("mobile recharge provider is here"); 
	
	}
	

}
