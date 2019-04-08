import java.util.HashMap;

class Bool extends Primary {
    boolean val;

    Bool(final boolean b) {
        val = b;
    }



    @Override
    void printParseTree(final String indent) {
    IO.displayln(indent + indent.length() + " <primary> " + val);
    }



	@Override
	Val Eval(HashMap<String, Val> state) {
		// TODO Auto-generated method stub
		return null;
	}
}