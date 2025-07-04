/* This file was generated by SableCC (http://www.sablecc.org/). */

package prolixa.node;

@SuppressWarnings("nls")
public abstract class Token extends Node
{
    private String text;
    private int line;
    private int pos;

    public String getText()
    {
        return this.text;
    }

    public void setText(@SuppressWarnings("hiding") String text)
    {
        this.text = text;
    }

    public int getLine()
    {
        return this.line;
    }

    public void setLine(@SuppressWarnings("hiding") int line)
    {
        this.line = line;
    }

    public int getPos()
    {
        return this.pos;
    }

    public void setPos(@SuppressWarnings("hiding") int pos)
    {
        this.pos = pos;
    }

    @Override
    public String toString()
    {
        return this.text + " ";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        throw new RuntimeException("Not a child.");
    }
}
