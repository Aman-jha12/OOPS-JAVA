abstract class Son extends Parent{
    @Override
    void carrer(String name) {
        System.out.println("The carrir is "+name);
    }

    @Override
    void marry(int age) {
        System.out.println("I want to marry a girl of age"+age);
    }
}
