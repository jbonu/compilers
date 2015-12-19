/* This file was generated by SableCC (http://www.sablecc.org/). */

package cplexer.node;

import cplexer.analysis.*;

@SuppressWarnings("nls")
public final class TKconst extends Token
{
    public TKconst()
    {
        super.setText("const");
    }

    public TKconst(int line, int pos)
    {
        super.setText("const");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKconst(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKconst(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKconst text.");
    }
}