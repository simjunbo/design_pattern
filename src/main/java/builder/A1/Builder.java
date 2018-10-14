package builder.A1;

/**
 * Builder (건축자)
 */
public interface Builder {
    void makeTitle(String title);

    void makeString(String str);

    void makeItems(String[] items);

    void close();
}
