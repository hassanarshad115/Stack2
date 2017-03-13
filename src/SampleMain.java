
public class SampleMain {
    public static void main(String []args)
    {
    Sample s=new Sample();
    s.setname("Amir jamshaid");
    s.setdepartment("computer science");
    s.setdesignation("head of department");
    s.setsalary(100000);
    
    System.out.println("the name is= \t"+s.getname());
    System.out.println("the department is=\t"+s.getdepartment());
    System.out.println("designation is=\t"+s.getdesignation());
    System.out.println("salary of hod is=\t"+s.getsalary());
    
    
    
    }
    
}
