public class Student{
private String fName;
private String lName;
private int age;
public void setF(String a){
fName=a;
}
public void setL(String b){
lName=b;
}
public void setA(int c){
age=c;
}
public String getF(){
return fName;}
public String getL(){
return lName;}
public int getA(){
return age;}
public void print(){
System.out.println("Studentis monacemebia "+fName+" "+lName+" "+age);}
}
