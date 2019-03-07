import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        MyGenericArrayList<Integer> arrayList= new MyGenericArrayList<>();
        for (int i=0; i<10; i++){
            arrayList.arrayList.add(i);
        }

        for (int i=0; i<arrayList.arrayList.size(); i++){
            System.out.println(arrayList.arrayList.get(i));

        }
    }
}
