
public class userController 
{
	private User[] arr; 
	private int i=0;
	///////////////////////////////
	public userController() 
	{
		arr=new User[100];
		for(int i=0;i<100;i++)
		{
			arr[i]=new User();
		}
	}
	///////////////////////////////
	public boolean SignIn(String email,String pass) 
	{
		boolean signedIn=false;
		if(checkAccount(email,pass)) 
		{
			 System.out.println("You are logged in successfully");
			 signedIn=true; 
		} 
		else   
		{
			System.out.println("You don't have an Acount..Please Sign Up"); 
			signedIn=false;
		}
		return signedIn;  
	} 
	///////////////////////////////
	public void SignUp(String uname ,String email,String pass)
	{
		if(!checkAccount(email,pass))
		{
			arr[i].setEmail(email); 
			arr[i].setUsername(uname);
			arr[i].Setpassword(pass); 
			i++;
			 System.out.println("You are signed up successfully");
		} 
		else                               
		{
			System.out.println("You already have an Acount..Please Sign In"); 
		}
	}
	///////////////////////////////
	public void pay()
	{
		
	}
	///////////////////////////////
	public void requestRefund(User u,int amount,Refund f,int id)
	{
		u.askForRefund(amount,f,id); 
	} 
	///////////////////////////////
	public boolean checkAccount(String e,String pass)
	{
		boolean check=false;
		
		for(int index=0;index<i;index++)
		{
			if(arr[index].getEmail()==e && arr[index].getPassword()==pass) 
			{
				check=true;
				break;
			}   
		}
		return check; 
	}
	///////////////////////////////
	public void searchForService(String service,Iform f) throws Exception
	{
		Service s; 
		if(service=="landline")  
		{
			s=new LandlineServices(5,f);
		}
		else if(service=="donations") 
		{
			s=new Donations(5,f); 
		}
		else if(service=="internetPayment") 
		{
			s=new InternetPaymentServices(5,f);	
		}
		else if(service=="mobileRecharge")
		{
			s=new MobileRechargeServices(5,f); 
		}	
		else 			
		{
			throw new Exception("This Service Is Not SUPPORTED");
		}		
		serviceProvider p[]=s.returnServiceProviders(); 
		p[0].chooseProvider();
		for(int i=0;i<5;i++)
		{
			 System.out.println(p[i].getName());	   
		}
	}
	///////////////////////////////
	public void selectService(Service service)
	{
		
	}
	//////////////////////////////
	public void checkDiscount()
	{
		
	}
}
