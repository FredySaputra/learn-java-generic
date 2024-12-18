package fredy.dwi.saputra.generic.application;

/* Constraint pada java generic dilakukan apabila ingin menggunakan tipe data tertentu saja.
 * Misalnya untuk tipe data string saja, atau number saja dan seterusnya. Karena tipe data
 * bawaan pada generic adalah object.
 */

public class ConstraintApp {
    public static void main(String[] args) {
    NumberData <Integer> integerData = new NumberData<>(2); // tidak error karena tipe data number
    NumberData <Long> longData = new NumberData<>(10L); // tidak error karena tipe data number

    //NumberData<String> stringData = new NumberData<String>("error"); // ERROR karena tipe data bukan number
    }

    public static class NumberData <T extends  Number>{ //Hanya tipe data number saja yang bisa
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
}
