/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import java.util.*;
import soot.jimple.parser.analysis.*;

public final class AClassNameMultiClassNameList extends PClassNameList
{
    private PClassName _className_;
    private TComma _comma_;
    private PClassNameList _classNameList_;

    public AClassNameMultiClassNameList()
    {
    }

    public AClassNameMultiClassNameList(
        PClassName _className_,
        TComma _comma_,
        PClassNameList _classNameList_)
    {
        setClassName(_className_);

        setComma(_comma_);

        setClassNameList(_classNameList_);

    }
    public Object clone()
    {
        return new AClassNameMultiClassNameList(
            (PClassName) cloneNode(_className_),
            (TComma) cloneNode(_comma_),
            (PClassNameList) cloneNode(_classNameList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassNameMultiClassNameList(this);
    }

    public PClassName getClassName()
    {
        return _className_;
    }

    public void setClassName(PClassName node)
    {
        if(_className_ != null)
        {
            _className_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _className_ = node;
    }

    public TComma getComma()
    {
        return _comma_;
    }

    public void setComma(TComma node)
    {
        if(_comma_ != null)
        {
            _comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comma_ = node;
    }

    public PClassNameList getClassNameList()
    {
        return _classNameList_;
    }

    public void setClassNameList(PClassNameList node)
    {
        if(_classNameList_ != null)
        {
            _classNameList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _classNameList_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_className_)
            + toString(_comma_)
            + toString(_classNameList_);
    }

    void removeChild(Node child)
    {
        if(_className_ == child)
        {
            _className_ = null;
            return;
        }

        if(_comma_ == child)
        {
            _comma_ = null;
            return;
        }

        if(_classNameList_ == child)
        {
            _classNameList_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_className_ == oldChild)
        {
            setClassName((PClassName) newChild);
            return;
        }

        if(_comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(_classNameList_ == oldChild)
        {
            setClassNameList((PClassNameList) newChild);
            return;
        }

    }
}
