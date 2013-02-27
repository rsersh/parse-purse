/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import visitor.*;

/**
 *
 * @author Rachel Sershon
 */
public class RepeatTree extends AST {

    public RepeatTree() {
    }
    
    @Override
    public Object accept(ASTVisitor v) {
        return v.visitRepeatTree(this);
    }
    
}
