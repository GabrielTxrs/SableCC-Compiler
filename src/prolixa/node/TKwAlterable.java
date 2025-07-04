/* This file was generated by SableCC (http://www.sablecc.org/). */

package prolixa.node;

import prolixa.analysis.*;

@SuppressWarnings("nls")
public final class TKwAlterable extends Token
{
    public TKwAlterable()
    {
        super.setText("alterable");
    }

    public TKwAlterable(int line, int pos)
    {
        super.setText("alterable");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKwAlterable(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKwAlterable(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKwAlterable text.");
    }
}
