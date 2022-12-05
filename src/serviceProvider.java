
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
	
	public void setName(String n) //change
	{
		name=n;
	}
	public String getName() //change
	{
		return name; 
	}
	public abstract void add(String s,Iform f); //change
	public abstract void chooseProvider(); 
	/////////////////////////////
	public void handleRequest()
	{
		
	}
	//////////////////////////////
	public void setFormDetails(int amount ,String phoneNumber,Iform f) //change
	{
		form=f;
		System.out.println(form.create());
	} 
	//////////////////////////////
	public void getPaymentMethod()
	{	
		
	}
}
