
public class LandlineServices implements Service
{
	int size=0;
	int i=0; 
	private serviceProvider[] arr;
	Iform f;
	//////////////////////////////
	public LandlineServices(int n,Iform form)
	{
		f=form; 
		size=n;
		arr=new LandlineServicesProvider[size]; 
		for(int i=0;i<size;i++)
		{
			arr[i]=new LandlineServicesProvider();
			arr[i].setName("---");	
		}
		createServiceProvider("Monthly receipt",f);
		createServiceProvider("Quarter receipt",f); 
	}
	@Override
	public void selectServiceProvider()
	{
		
	}
	@Override
	public String getService() 
	{
		return null;
	}
	@Override
	public serviceProvider createServiceProvider(String s,Iform f) 
	{ 
		arr[i++].add(s,f); 
		return new LandlineServicesProvider(); 
	} 
	@Override
	public serviceProvider[] returnServiceProviders()
	{
		return arr;
	}
}
