package fredy.dwi.saputra.generic.application;

/* Constraint bisa di implement lebih dari satu, namun harus menggunakan interface tidak boleh class
 * Cara penulisannya hanya perlu tanda & lalu dituliskan interface nya
 */

public class MultipleConstraintApp {
    public static void main(String[] args) {
    //Data<Manager> manager = new Data<>(new Manager());// ERROR karena tidak implement interface
    Data<VicePresident> viceManagerData = new Data<>(new VicePresident());
    }
    public static interface CanSayHello{
        void sayHello(String name);
    }

    public static abstract  class Employee {};

    public static class Manager extends Employee {};

    public static class VicePresident extends  Employee implements CanSayHello{
        @Override
        public void sayHello(String name) {
            System.out.println("Hello"+name);
        }
    };

    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public Data(T data) {
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
