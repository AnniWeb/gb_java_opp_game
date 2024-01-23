package Map;
import Characters.CharacterInterface;

public class GameMap {
    private int size;
    private CharacterInterface[][] occupiedCells;

    public GameMap(int size) {
        this.size = size;
        this.occupiedCells = new CharacterInterface[size][size];
    }

    public int getSize() {
        return size;
    }

    private boolean isValidCoordinate(int x, int y) {
        return x >= 0 && x < size && y >= 0 && y < size;
    }

    private boolean isCellEmpty(int x, int y) {
        return isValidCoordinate(x, y) && occupiedCells[x][y] == null;
    }

    public void printMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!isCellEmpty(i, j)) {
                    System.out.print(occupiedCells[i][j] + " ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }

    public void placeCharacter(CharacterInterface figure) {
        int x = figure.getPosition().getX();
        int y = figure.getPosition().getY();
        if (isValidCoordinate(x, y) && isCellEmpty(x, y)) {
            occupiedCells[x][y] = figure;
        } else {
            System.out.println("Позиция занята.");
        }
    }

    public boolean moveTo(CharacterInterface figure, int x, int y) {
        if (!isValidCoordinate(x, y) || !isCellEmpty(x, y)) {
            return false;
        }

        occupiedCells[x][y] = figure;
        occupiedCells[figure.getPosition().getX()][figure.getPosition().getY()] = null;

        return true;
    }
}
