public class Human {

static int roll=2;

    public static void display(){
        System.out.println(Human.roll);
    }

    public static void main(String[] args) {
        Human aman = new Human();
//        aman.message = "Hi its aman";
//        Human.display(aman);
        Human.roll=3;
        Human.display();
    }

}