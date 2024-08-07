public class MyClass {
    String surname;
    String name;
    int age;
    String[] lesson=new String[3];
    String[] food=new String[2];

    public MyClass(String surname,String name,int age){
        this.surname=surname;
        this.name=name;
        this.age=age;
    }
    public  MyClass (String[] lesson,String[] food){
    this.lesson=lesson;
    this.food=food;
    }
}
