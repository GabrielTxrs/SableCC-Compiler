/* This file was generated by SableCC (http://www.sablecc.org/). */

package prolixa.node;

import prolixa.analysis.*;

@SuppressWarnings("nls")
public final class TEqual extends Token
{
    public TEqual()
    {
        super.setText("=");
    }

    public TEqual(int line, int pos)
    {
        super.setText("=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEqual(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEqual(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEqual text.");
    }
}
