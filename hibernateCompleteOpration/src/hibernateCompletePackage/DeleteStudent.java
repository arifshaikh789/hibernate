package hibernateCompletePackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {

	public static void main(String ar[])
	{
		
	    Configuration cfg=new Configuration();
	     cfg.configure("cfg.xml");
	     
	     SessionFactory fact=cfg.buildSessionFactory();
	     Session session=fact.openSession();
	     Transaction tx = session.beginTransaction();
	     
         StudentDto sd = (StudentDto) session.get(StudentDto.class, 2);

         session.delete(sd);
	    	System.out.println("Object delete successfully.....!!");
	        tx.commit();
	     
	}
}
