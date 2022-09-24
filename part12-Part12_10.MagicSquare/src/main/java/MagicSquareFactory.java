
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        
        int row = 0;
        int col = size / 2;
        
        square.placeValue(row, col, 1);
        
        for (int i = 2; i <= size * size; i++) {
            int currentRow = row;
            int currentCol = col;
            
            row -= 1;
            if (row < 0) {
                row = size - 1;
            }
            col += 1;
            if (col > size - 1) {
                col = 0;
            }
            if (square.readValue(row, col) > 0) {
                row = currentRow + 1;
                col = currentCol;
            }
            square.placeValue(row, col, i);
        }
        
        return square;
    }   
}
