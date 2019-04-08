class While extends Statement {
    E expr;
    Statement statement;

    While(final E e, final Statement s)  {
        expr = e;
        statement = s;

    }



      

    @Override
    void printParseTree(final String indent) {
        final String indent1 = indent + " ";

IO.displayln(indent + indent.length() + " <statement>");
 IO.displayln(indent1 + indent1.length() + " while");
        expr.printParseTree(indent1);
        statement.printParseTree(indent1);
    }
}
