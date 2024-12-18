package fredy.dwi.saputra.generic.application;

import fredy.dwi.saputra.generic.MyData;

public class CovariantApp {
    //COVARIANT : Mengambil data dari generic class (read only) menggunakan tambahan '?'
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Fredy"); //bisa
        process(stringMyData);

        MyData<? extends Object> objectMyData = new MyData<>("Fredy"); // bisa
        process(objectMyData);
    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());

        //myData.setData("Dwi"); ERROR karena tidak boleh set data

    }
}
