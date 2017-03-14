
public class NoContactException extends Exception {

    public NoContactException(String cause) {
        super(cause);
    }

    public String toString() {
        return "H epafi " + super.toString() + " den yparxei ston katalogo";
    }

}
