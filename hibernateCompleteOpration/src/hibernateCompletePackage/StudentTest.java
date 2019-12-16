package hibernateCompletePackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest
{
	public static void main(String ar[])
	{
		
		Configuration cf=new Configuration();
		cf.configure("cfg.xml");
		
		SessionFactory factory = cf.buildSessionFactory();
		Session session = factory.openSession();
		
		StudentDto sd=new StudentDto();
		sd.setSid(1);
		sd.setSname("arif");
		sd.setAddress("indore");
		
		Transaction tx = session.beginTransaction();
		session.save(sd);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
		
	}

}
