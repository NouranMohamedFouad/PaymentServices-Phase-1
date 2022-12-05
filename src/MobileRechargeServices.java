
public class MobileRechargeServices implements Service
{
	
	int size=0;
	int i=0; 
	private MobileRechargeServicesProvider[] arr; 
	Iform f;
	//////////////////////////////
	public MobileRechargeServices(int s,Iform form)
	{
		f=form; 
		size=s; 
		arr=new MobileRechargeServicesProvider[size]; 
		for(int i=0;i<size;i++) 
		{
			arr[i]=new MobileRechargeServicesProvider(); 
			arr[i].setName("---");                    	 
		}	
		createServiceProvider("Vodafone",f);
		createServiceProvider("Etsilat",f);
		createServiceProvider("Orange",f);
		createServiceProvider("We",f);
	}
	@Override
	public void selectServiceProvider() 
	{
		// TODO Auto-generated method stub
	}
	@Override
	public String getService() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public serviceProvider createServiceProvider(String s,Iform f) 
	{ 
		arr[i++].add(s,f);  
		return new MobileRechargeServicesProvider();
	} 
	@Override
	public serviceProvider[] returnServiceProviders()
	{
		
		/*for(int i=0;i<5;i++)
		{
			 System.out.println(arr[i].getName());
		}
		*/
		return arr;
	}
}
