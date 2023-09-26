package study.gbhu.designPattern.behavioralPattern.interpreterPattern;

import java.util.List;

public class Sequence implements Expression{
    private List<Expression> expressions;

    public Sequence(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public void interpret() {
        expressions.forEach(expression -> expression.interpret());
    }
}
