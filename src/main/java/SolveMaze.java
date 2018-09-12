import edu.illinois.cs.cs125.lib.mazemaker.Maze;

/**
 * Solve a randomly-generated maze.
 *
 * @see <a href="https://github.com/cs125-illinois/mazemaker">Mazemaker on GitHub</a>
 * @see <a href="https://cs125-illinois.github.io/mazemaker/">Mazemaker Documentation</a>
 * @see <a href="https://cs125.cs.illinois.edu/lab/2/#maze">Lab 2 Writeup</a>
 */
@SuppressWarnings("checkstyle:emptyblock")
public class SolveMaze {

    /**
     * Implement your maze solving algorithm in the main method below.
     *
     * @param unused unused input arguments
     */

    public static void main(final String[] unused) {
        /*
         * Create a new 10 x 10 maze. Feel free to change these values.
         */
        Maze maze = new Maze(5, 5);

        /*
         * Pick (0, 0), the bottom left corner, as the starting point.
         * Put the end in the top right corner.
         */
        maze.startAtZero();
        maze.endAtTopRight();

        /*
         * You should be able to solve a 10 x 10 maze in (far fewer than) 1000 steps.
         * Feel free to adjust this number if you experiment with other mazes.
         */
        for (int step = 0; step < 1000; step++) {
            // Implement your maze solving algorithm here
//            while (!maze.isFinished()) {
//                maze.turnLeft();
//                if (maze.canMove()) {
//                    maze.move();
//                }
//                else {
//                    while (!maze.canMove()) {
//                        maze.turnRight();
//                    }
//                    maze.move();
//                }
//            }
            //Walk Forward if possible
            while (!maze.isFinished()) {
                if (maze.canMove()) {
                    maze.move();
                    // If not possible to walk forward, turn left or right. Use Math.random (where it is a number
                    // between 0 and 1, 1 not included, and if Math.random is more than 0.5, turn right.
                } else {
                    if (Math.random() > 0.5) {
                        maze.turnRight();
                        // If less than 0.5, turn left
                    } else {
                        maze.turnLeft();
                    }
                }
            }
        }

            if (maze.isFinished()) {
                System.out.println("You solved the maze!");
            } else {
                System.out.println("Try again!");
            }

    }
}
