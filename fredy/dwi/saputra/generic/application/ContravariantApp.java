package fredy.dwi.saputra.generic.application;

import fredy.dwi.saputra.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        // CONTRAVARIANT: Aman saat set data tapi bahaya jika get data
        MyData<Object> objectMyData = new MyData<>("Fredy D. S");
        objectMyData.setData(1000);
        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData){
        Object value = myData.getData(); // bisa tapi tidak aman (hindari)
        System.out.println("Proses: "+value); // tidak error karena value ber tipe data object, jika string maka error

        myData.setData("Fred");
    }
}
