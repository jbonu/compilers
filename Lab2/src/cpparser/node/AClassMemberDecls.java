/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class AClassMemberDecls extends PClassMemberDecls
{
    private PClassMember _right_;

    public AClassMemberDecls()
    {
        // Constructor
    }

    public AClassMemberDecls(
        @SuppressWarnings("hiding") PClassMember _right_)
    {
        // Constructor
        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AClassMemberDecls(
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassMemberDecls(this);
    }

    public PClassMember getRight()
    {
        return this._right_;
    }

    public void setRight(PClassMember node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._right_ == oldChild)
        {
            setRight((PClassMember) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
