public class Classmember {
    public static void main(String[] args) {
        member obj=new member();
        obj.age=45;
        obj.name="mumma";
        obj.salary=27000;

        obj.display();
    }
}


     class member
    {
        String name;
        int age;
        double salary;

         void display()
    {

        System.out.println("name is"+name);
        System.out.println(" age is "+age);
        System.out.println("salary is "+salary);

    }
}
