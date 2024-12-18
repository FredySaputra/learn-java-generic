package fredy.dwi.saputra.generic.application;

import fredy.dwi.saputra.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Fredy","Dwi","Saputra"};
        Integer[] numbers = {1,2,3,4,5};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(numbers));

    }
}
