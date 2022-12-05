
public abstract class serviceProvider 
{
	private String name;
	protected Iform form;
	protected paymentMethod payemt; 
    ///////////////////////////
    public serviceProvider()
    {
    	form=new Form();
    }
	
	public void setName(String n) 
	{
		name=n;
	}
	public String getName() 
	{
		return name; 
	}
	public abstract void add(String s,Iform f); 
	public abstract void chooseProvider(); 
	/////////////////////////////
	public void handleRequest()  
	{
		
	}
	//////////////////////////////
	public void setFormDetails(int amount ,String phoneNumber,Iform f) 
	{
		form=f;
		System.out.println(form.create());
	} 
	//////////////////////////////
	public void getPaymentMethod()
	{	
		
	}
}
