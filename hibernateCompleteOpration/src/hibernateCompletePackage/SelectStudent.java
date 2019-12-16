package hibernateCompletePackage;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectStudent {
	public static void main(String ar[])
	{
	
			
		     Configuration cfg=new Configuration();
		     cfg.configure("cfg.xml");
		     
		     SessionFactory fact=cfg.buildSessionFactory();
		     Session session=fact.openSession();
		     
		      Query query=session.createQuery("from StudentDto where Sid=1");
		      
		      List l=query.list();
		      Iterator it= l.iterator();
		      
		      while(it.hasNext())
		      {
		    	  
		    	  StudentDto sd=(StudentDto)it.next();
		    	  System.out.println(sd.getSid()+" "+sd.getSname()+" "+sd.getAddress());
		      }
		
		
	}

}
