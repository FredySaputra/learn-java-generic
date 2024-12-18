package fredy.dwi.saputra.generic.application;

import fredy.dwi.saputra.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        //IVARIANT: TIDAK BISA MELAKUKAN POLYMORPHISM
        MyData<String> stringMyData = new MyData<>("tes");
        //MyData<Integer> integerMyData = stringMyData;// ERROR
        //MyData<Object> objectMyData = stringMyData; // ERROR

        MyData<Object> objectMyData = new MyData<>("Oke");
        //MyData<String> stringMyData2 = objectMyData; // ERROR

        //doIt(stringMyData);// ERROR
        //doItString(objectMyData); // ERROR
    }

    public static void doIt(MyData<Object> stringMyData) {
        // do
    }

    public static void doItString(MyData<Integer> integerMyData) {
        // do
    }
}
