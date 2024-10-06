import java.util.Random;
public class LightBoard {


    private boolean[][] lights;

    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];
        Random random = new Random();
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                lights[r][c] = random.nextFloat() < 0.4;
            }
        }
    }

    public boolean[][] getLights() {
        return lights;
    }

    public void setLights(boolean[][] lights) {
        this.lights = lights;
    }


    public boolean evaluateLight(int row, int col)
    {
        int count = 0;

        for (int i = 0; i < lights.length; i++)
        {
            if (lights[i][col]){
                count++;
            }
        }

        if (lights[row][col])
        {
            if (count % 2 == 0){
                return false;

            }
        }

        else if (count % 3 == 0){
            return true;
        }

        return lights[row][col];

    }
}