package independentcopy;

import java.util.ArrayList;

public class ListReader implements Reader
{
    ArrayList<String> arrayList;



    /**
     * Return a string of the last element of the array list
     * @return String representation of the last element of the array list
     */
    @Override
    public String readln() {
        arrayList = new ArrayList<>();
        arrayList.add("Java");
        return arrayList.get(arrayList.size() - 1);
    }
}