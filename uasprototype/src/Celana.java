abstract class Celana implements Cloneable {

    protected String tipeCelana;

    abstract void tambahStok();

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}

