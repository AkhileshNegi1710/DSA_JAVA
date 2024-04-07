class ParentClass
{
    void display()
    {
        System.out.println("Parent");
    }


}

class ChildClass extends ParentClass
{
    void display()
    {
        System.out.println("Child");
    }
}


public class sample {
    public static void main(String[] args) {
        ParentClass obj=new ChildClass();
        obj.display();
    }
}
