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
    //     myinterface i=new myinterface()
    //      {

    //         @Override
    //         public void sayHello() 
    //         {
    //            System.out.println("This is the first anonymous class without implementing the interface");
                
    //         }
            
    //     };
    //     i.sayHello();
    //     myinterface i1=new myinterface()
    //     {

    //        @Override
    //        public void sayHello() 
    //        {
    //           System.out.println("This is the secnd anonymous class without implementing the interface");
               
    //        }
           
    //    };
    //    i1.sayHello();

    //using lambda function
    myinterface i= ()-> System.out.println("This is first using lambda Expression");
    myinterface i1= ()-> System.out.println("This is second using lambda Expression");
    i.sayHello();
    i1.sayHello();
    }
    
}
