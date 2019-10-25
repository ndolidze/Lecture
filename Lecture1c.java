import java.util.Scanner;
public class Lecture1c{
public static void main(String [] args){
Student d=new Student();
Scanner myObj=new Scanner(System.in);
System.out.println("Shemoitanet Studentis saxeli gvari da asaki");
d.setF(myObj.next());
d.setL(myObj.next());
d.setA(myObj.nextInt());
if(d.getA()<0)
   System.out.println("Age"+d.getA()+" you provided is incorrect, Please choose another");
else d.print();


}
}