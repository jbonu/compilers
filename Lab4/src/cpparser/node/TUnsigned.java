/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class TUnsigned extends Token
{
    public TUnsigned()
    {
        super.setText("unsigned");
    }

    public TUnsigned(int line, int pos)
    {
        super.setText("unsigned");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TUnsigned(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTUnsigned(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TUnsigned text.");
    }
}