class Student{
  String name;
  public Student(String s){
    name = s;
  }
  public Student(){
    name = "Unknown";
  }
}

class Ans{
  public static void main(String[] args){
    Student s = new Student("Muhammad Huzaifa");
    Student a = new Student();

    System.out.println(s.name);
    System.out.println(a.name);
  }
}