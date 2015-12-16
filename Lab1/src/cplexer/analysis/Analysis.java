/* This file was generated by SableCC (http://www.sablecc.org/). */

package cplexer.analysis;

import cplexer.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTWhiteSpace(TWhiteSpace node);
    void caseEOF(EOF node);
}
