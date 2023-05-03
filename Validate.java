public static void Validate(final int[][] sudokuBoard)
{
    int width = sudokuBoard[0].length;
    int height = sudokuBoard.length;

    for(int i = 0; i < width; i++)

        if(!IsValidRow(sudokuBoard, i, width))
        {
            System.out.print("(Row)" + i + "  Error Detected \n");
          //Do something - The row has repetitions
        }
    for(int j = 0; j < height; j++)
        if(!IsValidColumn(sudokuBoard, j, height))
        {
            System.out.print(" (Column)" + j + "  Error Detected \n");
          //Do something - The columns has repetitions
        }
   for(int i=0; i<3; i++)
      if(!isBlock1Valid(sudokuBoard,width, height)){
          System.out.print("hi");
        }

}

static boolean isBlock1Valid(int[][] sudokuBoard, int referenceRow, int referenceColumn)
{
    block1
    boolean[] seen = new boolean[9];

    for (int i = 0; i < 3; i++){

        for (int j = 0; j < 3; j++){

            if ( seen[sudokuBoard[referenceColumn+i][referenceRow+j]]) return false;


    else ( seen[sudokuBoard[referenceColumn+i][referenceRow+j]]) = true;
    }
    }
return true;
}