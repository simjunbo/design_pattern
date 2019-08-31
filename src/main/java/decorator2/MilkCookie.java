package decorator2;

/**
 * Concreate Decorator
 */
public class MilkCookie extends Decorator {

    public MilkCookie(Cookie cookie) {
        super(cookie);
    }

    public String getName() {
        return "Milk " + super.getName();
    }
}
