//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//  todo      MyClass деген класс тузунуз
//        Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз,
//        Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//        Параметри эки башка болгон эки конструктор тузунуз
//        MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
//        Эки объектке эки башка конструктор иштесин.
//        Объекттердин маанилерин консольго чыгарыныз.


        MyClass myClass=new MyClass("Narynbek uulu","Babakhan",30);

       String[] lesson = {"Constructor","Massiv","Peremennyi","OOP"};
        String[] food = {"Manty","Lagman","Besh"};

        MyClass myClass1=new MyClass(lesson,food);

        System.out.println("FIO = " + myClass.surname+"  "+myClass.name+" , "+myClass.age);
        System.out.println("myClass1.lesson = " +String.join(",",myClass1.lesson));
        System.out.println("myClass1.food  = " + String.join(",", myClass1.food));

    }
}