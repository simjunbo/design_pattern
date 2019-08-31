package decorator2;

/**
 * Decorator
 */
public abstract class Decorator implements Cookie {

    private Cookie cookie;

    public Decorator(Cookie cookie) {
        this.cookie = cookie;
    }

    public String getName() {
        return cookie.getName();
    }
}
