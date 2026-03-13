import java.util.Stack;

/** An operator in a postfix expression with operands of type T. */
public interface PostfixOperator<T> {

    /**
     * Pops the required number of operands from the stack, applies the operator to
     * them, and pushes the result back on to the stack.
     */
    void apply(Stack<T> operands);
}
