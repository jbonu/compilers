/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class AIfElseStmtStmt extends PStmt
{
    private TIf _if_;
    private PCondition _condition_;
    private PStmt _left_;
    private TElse _else_;
    private PStmt _right_;

    public AIfElseStmtStmt()
    {
        // Constructor
    }

    public AIfElseStmtStmt(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") PCondition _condition_,
        @SuppressWarnings("hiding") PStmt _left_,
        @SuppressWarnings("hiding") TElse _else_,
        @SuppressWarnings("hiding") PStmt _right_)
    {
        // Constructor
        setIf(_if_);

        setCondition(_condition_);

        setLeft(_left_);

        setElse(_else_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AIfElseStmtStmt(
            cloneNode(this._if_),
            cloneNode(this._condition_),
            cloneNode(this._left_),
            cloneNode(this._else_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfElseStmtStmt(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public PCondition getCondition()
    {
        return this._condition_;
    }

    public void setCondition(PCondition node)
    {
        if(this._condition_ != null)
        {
            this._condition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._condition_ = node;
    }

    public PStmt getLeft()
    {
        return this._left_;
    }

    public void setLeft(PStmt node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TElse getElse()
    {
        return this._else_;
    }

    public void setElse(TElse node)
    {
        if(this._else_ != null)
        {
            this._else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._else_ = node;
    }

    public PStmt getRight()
    {
        return this._right_;
    }

    public void setRight(PStmt node)
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
            + toString(this._if_)
            + toString(this._condition_)
            + toString(this._left_)
            + toString(this._else_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._condition_ == child)
        {
            this._condition_ = null;
            return;
        }

        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._else_ == child)
        {
            this._else_ = null;
            return;
        }

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
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._condition_ == oldChild)
        {
            setCondition((PCondition) newChild);
            return;
        }

        if(this._left_ == oldChild)
        {
            setLeft((PStmt) newChild);
            return;
        }

        if(this._else_ == oldChild)
        {
            setElse((TElse) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
