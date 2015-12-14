public class NotChecker implements Checker {
    public Checker input;
    
    public NotChecker (Checker input) {
        this.input = input;
    }
    
    public boolean accept (String text) {
        return !(input.accept(text));
    }
}