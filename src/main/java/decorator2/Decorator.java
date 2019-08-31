package decorator2;

/**
 * Decorator
 */
public abstract class Decorator implements Cookie {

    protected Cookie cookie;

    public Decorator(Cookie cookie) {
        this.cookie = cookie;
    }
}
