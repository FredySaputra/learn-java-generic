package fredy.dwi.saputra.generic;

public class MyData<T> {

    private T data;

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "data=" + data +
                '}';
    }

    public void setData(T data) {
        this.data = data;
    }
}
