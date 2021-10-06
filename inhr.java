class person
{
String name;
String gender;
String address;
int age;{
person(String name,String gender,String address,int age);
}
}
class employee extends person
{
int empid;
String company_name;
String qualification;
int salary;
{
employee(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary);
super(String name,String gender,String address,int age);
}
}
class teacher extends employee
{
String subject;
String department;
int teacherid;{
teacher(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary,String subject,String department,int teacherid);
super(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary);
{
void display();
class inhr
{
public static void main(string[]args)
{
teacher obj=new teacher();
obj=sc.nextInt();
int a[]=new obj.teacher();
teacher("anooja","female","address",23,123,"tcs","mca","2000", "physics","fisat",12345);
}
}
}
}
