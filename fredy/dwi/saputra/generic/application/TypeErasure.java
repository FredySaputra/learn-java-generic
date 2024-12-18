package fredy.dwi.saputra.generic.application;

import fredy.dwi.saputra.generic.MyData;

/**
 * Type Erasure yaitu saat inisialisasi tidak mencantumkan tipe data generic nya.
 * Saat compile tidak terjadi masalah, tapi saat run akan error.
 * kode dibawah akan error jika dijalankan.
 * */
public class TypeErasure {
    public static void main(String[] args) {
        MyData myData = new MyData("Fredy");
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }

}
