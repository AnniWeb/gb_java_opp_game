package Map;

public class Cell {
    private Integer x, y;

    public Cell(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public String toString() {
        return getX()+"/"+getY();
    }

    public double calculateDistance(Cell target) {
        return Math.sqrt((target.getY() - y) * (target.getY() - y) + (target.getX() - x) * (target.getX() - x));
    }
}
