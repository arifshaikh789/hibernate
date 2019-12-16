package hibernateCompletePackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main(String ar[])
	{
		    Configuration cfg=new Configuration();
		     cfg.configure("cfg.xml");
		     
		     SessionFactory fact=cfg.buildSessionFactory();
		     Session session=fact.openSession();
		     Transaction tx = session.beginTransaction();
		    /* StudentDto sd=new StudentDto();
		     
		    // sd.setSid(2);
		     sd.setAddress("bpl");
		     sd.setSname("hope");
		     
		 
				session.update(sd);
				System.out.println("Object update successfully.....!!");
				tx.commit();
				session.close();
				fact.close();*/
	           
		     StudentDto student = (StudentDto) session.load(StudentDto.class, 2);
			        student.setSname("jack");
			        session.update(student);
			    	System.out.println("Object update successfully.....!!");
			        tx.commit();
	}
	
}
