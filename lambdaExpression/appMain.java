package lambdaExpression;

public class appMain
{
    public static void main(String[] args) 
    {
     System.out.println("This is print from main method");  
       
     //using anonymous class implements interface
    //  lambdaimplements i=new lambdaimplements();
    //  i.sayHello();
    //or
        myinterface i=new myinterface()
         {

            @Override
            public void sayHello() 
            {
               System.out.println("This is the first anonymous class without implementing the interface");
                
            }
            
        };
        i.sayHello();
        myinterface i1=new myinterface()
        {

           @Override
           public void sayHello() 
           {
              System.out.println("This is the secnd anonymous class without implementing the interface");
               
           }
           
       };
       i1.sayHello();
    }
    
}
