package cz.cvut.fel.omo.cv8;

import java.util.Set;

public class Unique {
    protected final ListExpression sub;

    public Unique(ListExpression sub) {
        this.sub = sub;
    }
    Set<Integer> set = new HashSet<>(sub);
    sub.clear();
    sub.addAll(set);
    
}