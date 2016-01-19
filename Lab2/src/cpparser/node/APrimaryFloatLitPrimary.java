/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class APrimaryFloatLitPrimary extends PPrimary
{
    private TFloatLiteral _floatLiteral_;

    public APrimaryFloatLitPrimary()
    {
        // Constructor
    }

    public APrimaryFloatLitPrimary(
        @SuppressWarnings("hiding") TFloatLiteral _floatLiteral_)
    {
        // Constructor
        setFloatLiteral(_floatLiteral_);

    }

    @Override
    public Object clone()
    {
        return new APrimaryFloatLitPrimary(
            cloneNode(this._floatLiteral_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrimaryFloatLitPrimary(this);
    }

    public TFloatLiteral getFloatLiteral()
    {
        return this._floatLiteral_;
    }

    public void setFloatLiteral(TFloatLiteral node)
    {
        if(this._floatLiteral_ != null)
        {
            this._floatLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._floatLiteral_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._floatLiteral_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._floatLiteral_ == child)
        {
            this._floatLiteral_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._floatLiteral_ == oldChild)
        {
            setFloatLiteral((TFloatLiteral) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
