package fredy.dwi.saputra.generic.application;

import fredy.dwi.saputra.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
    print(new MyData<Integer>(100));
    print(new MyData<String>("Fredy"));
    print(new MyData<MultipleConstraintApp.Employee>(new MultipleConstraintApp.Employee() {
    }));
    }


    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
