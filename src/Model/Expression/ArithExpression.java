package Model.Expression;
import Exception.MyException;
import Model.ADT.MyIDictionary;

public class ArithExpression implements Expression {
    private Expression expression1;
    private Expression expression2;
    private int op;

    public ArithExpression(char op, Expression e1, Expression e2) {
        if(op == '+')
            this.op = 1;
        if(op == '-')
            this.op = 2;
        if(op == '*')
            this.op = 3;
        if(op == '/')
            this.op = 4;

        this.expression1 = e1;
        this.expression2 = e2;
    }

    public int eval(MyIDictionary<String, Integer> table) throws MyException{
        if(op == 1)
            return expression1.eval(table) + expression2.eval(table);
        if(op == 2)
            return expression1.eval(table) - expression2.eval(table);
        if(op == 3)
            return expression1.eval(table) * expression2.eval(table);
        if(op == 4 && expression2.eval(table) != 0)
                return (expression1.eval(table)/expression2.eval(table));
            else
            if(expression2.eval(table)==0)
                throw new MyException("You cannot divide by 0!");
        throw new MyException("The provided operator is not valid.");
    }

    public String toStr() {
        if(op == 1)
            return expression1.toStr() + "+" + expression2.toStr();
        if(op == 2)
            return expression1.toStr() + "-" + expression2.toStr();
        if(op == 3)
            return expression1.toStr() + "*" + expression2.toStr();
        if(op == 4)
            return expression1.toStr() + "/" + expression2.toStr();
        return null;
    }
}
