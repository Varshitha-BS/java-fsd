class Student
{  
    int roll_no;  
    String stu_name;  
      
    Student(int i , String n)               
    {  
       roll_no = i;                        
       stu_name = n;                       
    }  
    void display()
    {
       System.out.println(roll_no+" "+stu_name);
    }  
   
    public static void main(String args[])
    {  
       Student s1 = new Student(1,"Akshay");  
       Student s2 = new Student(2,"Rajat");  
       s1.display();  
       s2.display();  
    }  
}