package newclass;

public class Variable3 {


     public static void main(String[]  args)
{

	int d=Variable2.y;

    System.out.println(d);

    Variable2 k=new  Variable2();     //call only non static method m1() by creating object...
     k.m1();
                                      // static m2 method values also get call because we have it in m()


}







}
