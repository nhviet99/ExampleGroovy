class Exam2{
static void main(String[] args) {
      Student st = new Student(1,"Joe");
      st.prints();
   } 
}
class Student {
   int StudentID;
   String StudentName;
   public Student(int ID, String Name)
   {
       this.StudentID= ID;
       this.StudentName= Name;
   }
   public void prints()
   {
       print("Hello ${StudentID}: ${this.StudentName}");
   }
}

