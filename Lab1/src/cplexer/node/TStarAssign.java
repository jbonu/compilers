/* This file was generated by SableCC (http://www.sablecc.org/). */

package cplexer.node;

import cplexer.analysis.*;

@SuppressWarnings("nls")
public final class TStarAssign extends Token
{
    public TStarAssign()
    {
        super.setText("*=");
    }

    public TStarAssign(int line, int pos)
    {
        super.setText("*=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStarAssign(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStarAssign(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TStarAssign text.");
    }
}
