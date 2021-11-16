package cz.cvut.fel.omo.cv8;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Set;

public class Remove implements ListExpression{
    protected final ListExpression sub;
    protected int element;

    public Remove(ListExpression sub, int element) {
        this.sub = sub;
        this.element = element;
    }
    
     @Override
    public ImmutableList<Integer> evaluate(Context c){
        Set<Integer> set = new ArrayList<>(set.evaluate(c));
        set.removeAll(Collection.singlleton(element));
        return ImmutableList.copyof(set);
    }
    
    public void accept(ListExpressionVisitor v){v.visitRemove(c this)};
