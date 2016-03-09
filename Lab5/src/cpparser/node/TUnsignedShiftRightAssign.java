/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class TUnsignedShiftRightAssign extends Token
{
    public TUnsignedShiftRightAssign()
    {
        super.setText(">>>=");
    }

    public TUnsignedShiftRightAssign(int line, int pos)
    {
        super.setText(">>>=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TUnsignedShiftRightAssign(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTUnsignedShiftRightAssign(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TUnsignedShiftRightAssign text.");
    }
}
