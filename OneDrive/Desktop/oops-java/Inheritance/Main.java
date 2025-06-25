public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Box box1=new Box(4.6,7.9,9.9);
        Box box2=new Box(box1);

        System.out.println(box1.w+" "+box1.h);
        BoxWeight box3=new BoxWeight();
        BoxWeight box4=new BoxWeight();
        System.out.println(box3.h+" "+box3.weight);

    }
}