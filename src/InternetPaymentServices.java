
public class InternetPaymentServices implements Service
{
	int size=0;
	int i=0; 
	private serviceProvider[] arr;
	Iform f;
	//////////////////////////////
	public InternetPaymentServices(int n,Iform form)
	{
		f=form;
		size=n;
		arr=new InternetPaymentServicesProvider[size]; 
		for(int i=0;i<size;i++)
		{
			arr[i]=new InternetPaymentServicesProvider();
			arr[i].setName("---");	
		}	
		createServiceProvider("Vodafone",f);
		createServiceProvider("Etsilat",f);
		createServiceProvider("Orange",f);
		createServiceProvider("We",f);
	}
	
	@Override
	public void selectServiceProvider() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getService() 
	{
		// TODO Auto-generated method stub
		return null;
	} 
	@Override
	public serviceProvider createServiceProvider(String s,Iform f) 
	{ 
		arr[i++].add(s,f);
		return new InternetPaymentServicesProvider();  
	} 
	@Override
	public serviceProvider[] returnServiceProviders()
	{
		return arr;
	}


}
