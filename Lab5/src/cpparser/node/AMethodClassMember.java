/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class AMethodClassMember extends PClassMember
{
    private PMethodDecl _methodDecl_;

    public AMethodClassMember()
    {
        // Constructor
    }

    public AMethodClassMember(
        @SuppressWarnings("hiding") PMethodDecl _methodDecl_)
    {
        // Constructor
        setMethodDecl(_methodDecl_);

    }

    @Override
    public Object clone()
    {
        return new AMethodClassMember(
            cloneNode(this._methodDecl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMethodClassMember(this);
    }

    public PMethodDecl getMethodDecl()
    {
        return this._methodDecl_;
    }

    public void setMethodDecl(PMethodDecl node)
    {
        if(this._methodDecl_ != null)
        {
            this._methodDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._methodDecl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._methodDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._methodDecl_ == child)
        {
            this._methodDecl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._methodDecl_ == oldChild)
        {
            setMethodDecl((PMethodDecl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
