/** An evaluator of postfix expressions involving operands of type T. */
public class PostfixEvaluator<T> {

    /**
     * Creates an evaluator of postfix expressions. The 'operandParser' is used to
     * convert String tokens into operands of type T. The 'operatorRegistry' is used
     * to look up operators by their tokens and apply them to operands.
     */
    public PostfixEvaluator(OperandParser<T> operandParser,
            PostfixOperatorRegistry<T> operatorRegistry) {
        // TODO: implement.
    }

    /**
     * Returns the result of evaluating the postfix expression represented by the
     * array of String tokens. Each String token is one of the following:
     * 1. The string representation of an operand of type T
     * 2. The symbol for an operator in the operator registry
     */
    public T evaluate(String[] expressionTokens) {
        // TODO: implement.
        return null;
    }

    // TODO: add member variables as needed.
}
