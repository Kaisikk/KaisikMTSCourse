package patterns.interpreter;

public class TerminalExpression implements Expression {

    private String date;

    public TerminalExpression(String date) {
        this.date = date;
    }

    @Override
    public boolean interpret(String conext) {
        if (conext.contains(date)) {
            return true;
        }
        return false;

    }
}
