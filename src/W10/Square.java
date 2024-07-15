package W10;

/*
 * This example is a violation of LSP
 */

public class Square extends Rectangle {
    public Square(int length) {
        super(length, length);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.length = width;
    }
}
