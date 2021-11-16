package cz.cvut.fel.omo.cv8;

public class PrintListExpressionVisitor implements ListExpressionVisitor {

    @Override
    public void visitIntList(IntList v) {
        System.out.print(v.list);
    }
    
    public void visitVarList(VarList v) {
        System.out.print(v.name);
    }
    public void visitedElemention(Concatenate c){
        System.out.print("c(");
        c.left.accept(this);
        System.out.print(", ");
        c.right.accept(this);
        System.out.print(")");
    }
}
