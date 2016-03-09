/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class AClassMemberSingleClassMemberDecls extends PClassMemberDecls
{
    private PClassMember _classMember_;

    public AClassMemberSingleClassMemberDecls()
    {
        // Constructor
    }

    public AClassMemberSingleClassMemberDecls(
        @SuppressWarnings("hiding") PClassMember _classMember_)
    {
        // Constructor
        setClassMember(_classMember_);

    }

    @Override
    public Object clone()
    {
        return new AClassMemberSingleClassMemberDecls(
            cloneNode(this._classMember_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassMemberSingleClassMemberDecls(this);
    }

    public PClassMember getClassMember()
    {
        return this._classMember_;
    }

    public void setClassMember(PClassMember node)
    {
        if(this._classMember_ != null)
        {
            this._classMember_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classMember_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._classMember_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._classMember_ == child)
        {
            this._classMember_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._classMember_ == oldChild)
        {
            setClassMember((PClassMember) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
