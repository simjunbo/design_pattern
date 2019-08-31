package decorator2;

/**
 * Concreate Decorator
 */
public class ChocoCookie extends Decorator {

    public ChocoCookie(Cookie cookie) {
        super(cookie);
    }

    public String getName() {
        return "Choco " + super.getName();
    }
}
