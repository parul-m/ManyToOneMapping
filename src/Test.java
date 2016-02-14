
import dto.Address;
import dto.Student;
import myconfig.connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
        SessionFactory sf = connection.getSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Student s1 = new Student(101, "Vidhi");
        Student s2 = new Student(102, "Nidhi");
        Student s3 = new Student(103, "Anjal");
        Student s4 = new Student(104, "Shreya");
        
        Address a1 = new Address(1, "Vijay Nagar");
        Address a2 = new Address(2, "Khajarana road");
        
        s1.setAdd(a1);
        s2.setAdd(a1);
        s3.setAdd(a2);
        s4.setAdd(a2);
        
        s.save(s1);
        s.save(s2);
        s.save(s3);
        s.save(s4);
        s.save(a1);
        s.save(a2);
        
        t.commit();
        s.close();
        sf.close();
    }
}
