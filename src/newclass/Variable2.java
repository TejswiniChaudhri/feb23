package newclass;

public class Variable2 
{
    int x=20;            //non static global variable
 
    static int y=50;    //static global variable
   
    static int z=40;
   
    void m1()           //non static method
    {
 
   
	int a=45;           //Initialization of non static global variable
    
	System.out.println(x);
	System.out.println(a);
	m2();
   }
  
    static void m2()     // static method
    {
    int b=15;     
    
    System.out.println(y);
    System.out.println(b);
    System.out.println(z);
    }
 
}
