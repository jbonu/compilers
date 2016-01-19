/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class AClassHdrRightClassDecl extends PClassDecl
{
    private TLeftFbrace _leftFbrace_;
    private PClassMemberDecls _classMemberDecls_;
    private TRightFbrace _rightFbrace_;

    public AClassHdrRightClassDecl()
    {
        // Constructor
    }

    public AClassHdrRightClassDecl(
        @SuppressWarnings("hiding") TLeftFbrace _leftFbrace_,
        @SuppressWarnings("hiding") PClassMemberDecls _classMemberDecls_,
        @SuppressWarnings("hiding") TRightFbrace _rightFbrace_)
    {
        // Constructor
        setLeftFbrace(_leftFbrace_);

        setClassMemberDecls(_classMemberDecls_);

        setRightFbrace(_rightFbrace_);

    }

    @Override
    public Object clone()
    {
        return new AClassHdrRightClassDecl(
            cloneNode(this._leftFbrace_),
            cloneNode(this._classMemberDecls_),
            cloneNode(this._rightFbrace_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassHdrRightClassDecl(this);
    }

    public TLeftFbrace getLeftFbrace()
    {
        return this._leftFbrace_;
    }

    public void setLeftFbrace(TLeftFbrace node)
    {
        if(this._leftFbrace_ != null)
        {
            this._leftFbrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftFbrace_ = node;
    }

    public PClassMemberDecls getClassMemberDecls()
    {
        return this._classMemberDecls_;
    }

    public void setClassMemberDecls(PClassMemberDecls node)
    {
        if(this._classMemberDecls_ != null)
        {
            this._classMemberDecls_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classMemberDecls_ = node;
    }

    public TRightFbrace getRightFbrace()
    {
        return this._rightFbrace_;
    }

    public void setRightFbrace(TRightFbrace node)
    {
        if(this._rightFbrace_ != null)
        {
            this._rightFbrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rightFbrace_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._leftFbrace_)
            + toString(this._classMemberDecls_)
            + toString(this._rightFbrace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._leftFbrace_ == child)
        {
            this._leftFbrace_ = null;
            return;
        }

        if(this._classMemberDecls_ == child)
        {
            this._classMemberDecls_ = null;
            return;
        }

        if(this._rightFbrace_ == child)
        {
            this._rightFbrace_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._leftFbrace_ == oldChild)
        {
            setLeftFbrace((TLeftFbrace) newChild);
            return;
        }

        if(this._classMemberDecls_ == oldChild)
        {
            setClassMemberDecls((PClassMemberDecls) newChild);
            return;
        }

        if(this._rightFbrace_ == oldChild)
        {
            setRightFbrace((TRightFbrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
