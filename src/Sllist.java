import bridges.connect.Bridges;
import bridges.base.SLelement;

public class Sllist {
    public static void main(String[] args) throws Exception {

        //create the bridges object
        Bridges bridges = new Bridges(0, "nguyenms2", "386889807102");

        //create two single-linked elements
        SLelement sle0 = new SLelement("Hello", "");
        SLelement sle1 = new SLelement("World", "");

        //Create a singly-linked list
        //by adding sle1 as sle0's next element
        sle0.setNext(sle1);

        //edit some visual properties of the two elements
        sle0.getVisualizer().setColor("Black");
        sle0.getVisualizer().setOpacity(0.5f);
        sle1.getVisualizer().setColor("green");

        //pass the first element of the list
        bridges.setDataStructure(sle0);

        //Visualize the list
        bridges.visualize();

    }
}
