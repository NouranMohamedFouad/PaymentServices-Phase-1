
public class textFeild extends Feild
{
    //////////////////////
	textFeild(Iform w)
	{
		wrapee=w; 
	}
	
	@Override
	public String create() 
	{
		return wrapee.create()+"  text feild  ";
	}
}
