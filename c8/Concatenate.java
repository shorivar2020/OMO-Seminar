package cz.cvut.fel.omo.cv8;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

public class Concatenate implements ListExpression {
    protected final ListExpression left;
    protected final ListExpression right;

    public Concatenate(ListExpression left, ListExpression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public ImmutableList<Integer> evaluate(Context c){
        List<Integer> l = new ArrayList<>(left.evaluate(c));
        List<Integer> r = new ArrayList<>(right.evaluate(c));
        l.addAll(r);
        return ImmutableList.empty(l);
    }
    
    @Override
    public void accept(ListExpressionVisitor c){c.visitConcatenate(c this)};
   
}
