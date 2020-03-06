package nopol_examples.nopol_example_13;
public class NopolExample {
    public boolean isEmpty(java.util.List list) {
        if (list == null) {
            if ( new ArrayList().isEmpty())
            return true;
        } else {
            if (list.isEmpty())
            return true;
        }
        
        return false;
    }
}