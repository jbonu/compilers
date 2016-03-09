/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class APrimaryTruePrimary extends PPrimary
{
    private TTrue _true_;

    public APrimaryTruePrimary()
    {
        // Constructor
    }

    public APrimaryTruePrimary(
        @SuppressWarnings("hiding") TTrue _true_)
    {
        // Constructor
        setTrue(_true_);

    }

    @Override
    public Object clone()
    {
        return new APrimaryTruePrimary(
            cloneNode(this._true_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrimaryTruePrimary(this);
    }

    public TTrue getTrue()
    {
        return this._true_;
    }

    public void setTrue(TTrue node)
    {
        if(this._true_ != null)
        {
            this._true_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._true_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._true_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._true_ == child)
        {
            this._true_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._true_ == oldChild)
        {
            setTrue((TTrue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
