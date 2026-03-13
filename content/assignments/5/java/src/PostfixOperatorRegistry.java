import java.util.HashMap;
import java.util.Map;

/**
 * A registry of PostfixOperators and their associated tokens in an expression.
 */
public class PostfixOperatorRegistry<T> {

    /** Registers the symbol 'operatorToken' to be the specified 'operator'. */
    public void register(String operatorToken, PostfixOperator<T> operator) {
        operators.put(operatorToken, operator);
    }

    /** Returns whether the registry contains the specified operatorToken. */
    public boolean containsOperator(String operatorToken) {
        return operators.containsKey(operatorToken);
    }

    /** Returns the operator associated with the specified 'operatorToken'. */
    public PostfixOperator<T> getOperator(String operatorToken) {
        return operators.get(operatorToken);
    }

    private final Map<String, PostfixOperator<T>> operators = new HashMap<>();
}
