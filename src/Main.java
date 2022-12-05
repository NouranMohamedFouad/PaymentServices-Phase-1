import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;
import java.io.*;
public class Main 
{
	public static void main(String[] args) throws Exception 
	{
        /////////////////////////EXCEPTION HANDLING ///////////////////////////////
		/*
		try
		{
		    int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]); //out of size of the array
		}
		catch (Exception e)
		{
		      System.out.println("You Did Something Wrong.");
		}
		//////////////////////////////////////////////////////////////////////////
		*/
		
		
		Iform f1=new Form();
		f1=new textFeild(f1); 
		f1=new dropDownFeild(f1);
		
		
		Iform f2=new Form();
		f2=new textFeild(f2); 
		f2=new textFeild(f2);
		f2= new dropDownFeild(f2);
		
		
		Iform f3=new Form();
		f3=new textFeild(f3); 
		f3=new dropDownFeild(f3);
		f3= new dropDownFeild(f3);
        
		
		String serviceName="landline";
		
		/*Service s; 
		if(service=="landline")  
		{
			s=new LandlineServices(5,f1);
		}
		else if(service=="donations") 
		{
			s=new Donations(5,f2); 
		}
		else if(service=="internetPayment") 
		{
			s=new InternetPaymentServices(5,f3);	
		}
		else if(service=="mobileRecharge")
		{
			s=new MobileRechargeServices(5,f2); 
		}
		else 			
		{
			throw new Exception("This Service Is Not SUPPORTED");
		}
		*/
		//serviceProvider sp=s.createServiceProvider();
		
		//sp.chooseProvider();
		//s.createServiceProvider("vodafone",f);
		
		//serviceProvider p[]=s.returnServiceProviders(); 
		
		//s.createServiceProvider("quarter recipient");
		 
        userController controller=new userController() ; 
		//user.SginIn(e,e); 
        //user.SignUp("nouran", "nouran.loly","123"); 
        //controller.SignIn("nouran.loly","123");  
		//user.SginUp("nouran","nouran.loly","123"); 
        controller.searchForService(serviceName, f3); 
		
		Transaction t=new Transaction(); 
		//t.addPaymentTrans(5);
		t.addPaymentTrans(2);
		t.addPaymentTrans(3);
		Wallet w=new Wallet();
		Refund r=new Admin(t);  
		User u=new User(w);
		//r.approveRefund(10, w,3);
		//r.approveRefund(20, w,2);
		//u.askForRefund(10,r,2);
		controller.requestRefund(u, 100, r, 2); 
		System.out.println(w.getAmount()); 
		Admin d=new Admin(t);  
		//d.listAllPaymentT();
		
		//p[0].chooseProvider();
		//p[0].setFormDetails(10,"fg3hv",f);
		//p[0].add("hi");
		
	    /*for(int i=0;i<5;i++)
		{
			 System.out.println(p[i].getName());	   
		}
		*/
		
		
		
        /*try
        {
        	//s.createServiceProvider("hello");
     	    FileWriter file=null;
     	    String filee="hi.txt"; 
            file = new FileWriter(filee);
            BufferedWriter Filewrite=new BufferedWriter(file);
            System.out.println("start writing..");
            for(int i=0;i<5;i++)
            {
                Filewrite.append("   "+p[i].getName()+"    ");
            }
            Filewrite.close();
            System.out.println("finished successfully.. ");
        }
        catch (IOException except)
        {
            except.printStackTrace();
        }
        */
	}
}
