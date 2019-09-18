package independentcopy;

import java.util.ArrayList;

/**
 * A simple class that demonstrates a capability to write a line of
 * text to an ArrayList. Notice this class is derived from the
 * interface <code>Writer</code>, which is an abstraction of these details.
 */
public class ListWriter implements Writer
{
    ArrayList<String> arrayList;



    /**
     * Adds a string to the array list
     * @param line String to add to array list
     */
    @Override
    public void writeln(String line)
    {
        arrayList = new ArrayList<>();
        arrayList.add(line);

    }


}