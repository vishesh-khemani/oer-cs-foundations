/** A parser that converts String tokens into operands of type T. */
public interface OperandParser<T> {

    /**
     * Returns an operand of type T corresponding to the String token.
     * For example, if T is Double and token is "3.14", this method returns the
     * double 3.14.
     */
    T parse(String token);
}
