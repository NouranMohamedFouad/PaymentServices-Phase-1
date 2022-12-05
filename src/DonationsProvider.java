
public class DonationsProvider extends serviceProvider
{
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
		System.out.println("donations provider is here"); 
	}
}
