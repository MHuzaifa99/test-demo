// Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default values name as "unknown", 
// age as '0' and address as "not available". It has two members with the same name 'setInfo'. First method has two parameters for name and age and assigns 
// the same whereas the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and 
// address of 10 students. Hint - Use array of objects

class Student {
    String name;
    int age;
    String address;
    public Student(){
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }
        public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public static void main(String[] args) {
        Student std = new Student();
        std.setInfo("Muhammad Huzaifa", 24);
        std.setInfo("Huzaifa", 23, "F.B Area");
        System.out.println(std.name);
        System.out.println(std.age);
        System.out.println(std.address);

    }
}
