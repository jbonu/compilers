/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class AMinuse5E5 extends PE5
{
    private TMinus _minus_;
    private PE5 _e5_;

    public AMinuse5E5()
    {
        // Constructor
    }

    public AMinuse5E5(
        @SuppressWarnings("hiding") TMinus _minus_,
        @SuppressWarnings("hiding") PE5 _e5_)
    {
        // Constructor
        setMinus(_minus_);

        setE5(_e5_);

    }

    @Override
    public Object clone()
    {
        return new AMinuse5E5(
            cloneNode(this._minus_),
            cloneNode(this._e5_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinuse5E5(this);
    }

    public TMinus getMinus()
    {
        return this._minus_;
    }

    public void setMinus(TMinus node)
    {
        if(this._minus_ != null)
        {
            this._minus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._minus_ = node;
    }

    public PE5 getE5()
    {
        return this._e5_;
    }

    public void setE5(PE5 node)
    {
        if(this._e5_ != null)
        {
            this._e5_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e5_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._minus_)
            + toString(this._e5_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._minus_ == child)
        {
            this._minus_ = null;
            return;
        }

        if(this._e5_ == child)
        {
            this._e5_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._minus_ == oldChild)
        {
            setMinus((TMinus) newChild);
            return;
        }

        if(this._e5_ == oldChild)
        {
            setE5((PE5) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
