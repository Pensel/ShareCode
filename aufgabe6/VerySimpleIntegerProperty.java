package uebung2.aufgabe6;

public class VerySimpleIntegerProperty
{
    private ChangeListener listener;

    private int value;

    public void set(Integer wert)
    {
        if (listener != null)
        {
            listener.changed(listener, value, wert);
        }
        value = wert;
    }

    public int get()
    {
        return value;
    }

    public void addListener(ChangeListener listener)
    {
        this.listener = listener;
    }

    public void removeListener(ChangeListener c)
    {
        listener = null;
    }

    public static void main(String[] args)
    {
        VerySimpleIntegerProperty prop = new VerySimpleIntegerProperty();
        ChangeListener listener = new ListenerOhneGenerics();
        prop.addListener(listener);

        prop.set(1);
        prop.set(1);
        prop.set(2);

        prop.removeListener(listener);
        prop.set(3);
        prop.addListener(listener);
        prop.set(4);
    }
}
