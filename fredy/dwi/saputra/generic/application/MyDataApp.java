package fredy.dwi.saputra.generic.application;

import fredy.dwi.saputra.generic.MyData;

public class MyDataApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("fredy");
        MyData<Integer> integerMyData = new MyData<Integer>(1);

        System.out.println(stringMyData.getData());
        System.out.println(integerMyData.getData());

    }
}
