public class SubstringChecker implements Checker {
    public String key;
    
    public SubstringChecker (String key) {
        this.key = key;
    }
    
    public boolean accept (String text) {
        return text.equals(this.key);
    }
}