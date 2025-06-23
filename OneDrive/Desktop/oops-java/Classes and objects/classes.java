import java.util.Scanner;
class classes{
    public static  void main(String [] args){
        Student[] students=new Student[5];
//        Student aman=new Student("Aman");
//        System.out.println(aman.rno);
//        Student rohit=new Student();
//        System.out.print(rohit.name);

//        Student karan=new Student();
//        karan.greet("karan");

//        Student random=new Student(aman); //We can also pass other objects in the constructor
//System.out.println(random.name);

        Student rand=new Student();
        System.out.println(rand.name);

        //the final keyword helps to make your content un modifiable means you cannot modify it like the normal dta types
        final int AMAN=6;
        // AMAN=9; will throw an error

        int AMAN2=AMAN;
        AMAN2=3;
        System.out.println(AMAN2);


        //Here many large numbers of objects are crreated that are destroyed everytime a new object is being created
        A new =new A("Aman");
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }
    }
}
class Student{
    int rno;
    String name;
    float marks;

    void  greet(String name){
//        System.out.print("Hello "+name);
    }
//here is how to call constructor in another constructor

    Student(){
        this(0,"rand",70.56f);//internally this() is replaced with Student() here
    }
    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    //Here we are using the available objects value to manipulate the passed object value
    Student(Student other){
        this.rno=other.rno;
        this.name= other.name;
        this.marks= other.marks;
    }
//
//     Student(int rno){
//        rno=rno;
//    }
//    Student(String name){
//        this.name=name;
//    }

//Here is how to use the finalize keyword where you can perform certain actions when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        System.out.println("The object is being destroyed");
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}