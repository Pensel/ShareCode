package uebung2.aufgabe6;

public class ListenerOhneGenerics implements ChangeListener
{
    public void changed(ChangeListener listener, Integer oldValue, Integer newValue)
    {
        if (oldValue != newValue)
        {
            System.out.println("changed from " + oldValue + " to " + newValue);
        }
    }

}
