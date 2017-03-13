//drived class ha ye
public class Sample { //is breket m veriables declare hoty hai
    private  String name;
    private String department;
    private String designation;
    private int salary;
    public Sample() //constructor create q k return type ni ha r class k name jsa h
    {            //value initialize
    name="";
    department="";
    designation="";
    salary=0;
 
    }
    //set process start  ismy value kse dosry veriable m dty hain
     public void setname(String n)
     {
     name=n;
     
     }
         public void setdepartment(String d)
         {
         department=d;
         
         }
     public void setdesignation(String dn)
     {
     designation=dn;
     }
     public void setsalary(int s)
     {
        salary=s; 
         
     }
     //get process start ismy vlaue get krny k lye lty hain get
     public String getname()
     {return name;}
    public String getdepartment()
    {return department;}
    
    public String getdesignation()
    {return designation;}
    
    public int getsalary()
    {return salary;}
    
    
}//main end

