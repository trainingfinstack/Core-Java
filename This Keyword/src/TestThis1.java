
class Teacher
{  
int rollno;  
String name;  
float fee;  

    Teacher(int rollno,String name,float fee)
    {  
    rollno=rollno;  
    name=name;  
    fee=fee;  
}  

    
    void display()
    {
    	System.out.println(rollno+" "+name+" "+fee);
    	}  
}  


   public class TestThis1{  
    public static void main(String args[]){  
    Teacher s1=new Teacher(111,"ankit",5000f);  
    Teacher s2=new Teacher(112,"sumit",6000f);  
    s1.display();  
    s2.display();  
}
}  
