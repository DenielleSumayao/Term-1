public class Exercise {
    public static void main(String[] args) throws Exception {
  
        char [][] mdArray = {
            {'P','R','E','Y'},
            {'L','A','V','A'},
            {'O','V','E','R'},
            {'T','E','N','D'}
        };
    
        // WORD 1
        System.out.println("1. WORD 1");
        for(int row = 0; row < 4; row++)

        for(int column = 0; column < 4; column++){

            if (row ==  0){

                System.out.print(mdArray[row][column]);

           } else

                System.out.print("");
        }

        // WORD 2
        System.out.println("");
        System.out.println("2. WORD 2");
        for(int row = 0; row < 4; row++)

        for(int column = 0; column < 4; column++){

            if (row ==  1){

                System.out.print(mdArray[row][column]);

           } else

                System.out.print(""); 
        }

        // WORD 3
        System.out.println("");
        System.out.println("3. WORD 3");
        for(int row = 0; row < 4; row++)

        for(int column = 0; column < 4; column++){

            if (row ==  2){

                System.out.print(mdArray[row][column]);

           } else

                System.out.print("");
        }

        // WORD 4
        System.out.println("");
        System.out.println("4. WORD 4");
        for(int row = 0; row < 4; row++)

        for(int column = 0; column < 4; column++){

            if (row ==  3){

                System.out.print(mdArray[row][column]);

           } else

                System.out.print("");
        }

        // WORD 5
        System.out.println("");
        System.out.println("5. WORD 5");
        for(int row = 0; row < 4; row++)

        for(int column = 0; column < 4; column++){

            if (column ==  0){

                System.out.print(mdArray[row][column]);

           } else

                System.out.print("");
        }

        // WORD 6
        System.out.println("");
        System.out.println("6. WORD 6");
        for(int row = 0; row < 4; row++)

        for(int column = 0; column < 4; column++){

            if (column ==  1){

                System.out.print(mdArray[row][column]);

           } else

                System.out.print("");
        }

        // WORD 7
        System.out.println("");
        System.out.println("7. WORD 7");
        for(int row = 0; row < 4; row++)

        for(int column = 0; column < 4; column++){

            if (column ==  2){

                System.out.print(mdArray[row][column]);

           } else

                System.out.print("");
        }

        // WORD 8
        System.out.println("");
        System.out.println("8. WORD 8");
        for(int row = 0; row < 4; row++)

            for(int column = 0; column < 4; column++){

                if (column ==  3){

                    System.out.print(mdArray[row][column]);

               } else

                    System.out.print("");
            }

        // WORD 9
        System.out.println("");
        System.out.println("9. WORD 9");

        for (int rows = 0; rows < 4; rows++) {
            System.out.println(" ");
            for (int columns = 0; columns < 4; columns++) {

                if (rows == 1 && (columns == 1 || columns == 2)) {
                    System.out.print(" ");
                }
                else if (rows == 2 && (columns == 1 || columns == 2)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(mdArray[rows][columns]);
                }
            }
        }

         // WORD 10
         System.out.println("");
         System.out.println("10. WORD 10");

         for (int rows = 0; rows < 4; rows++) {
             System.out.println(" ");
             for (int columns = 0; columns < 4; columns++) {

         if (rows == 0 && (columns == 1 || columns == 2)) {
System.out.print(" ");
}

         else if (rows == 1 && (columns == 0 || columns == 3)) {
             System.out.print(" "); 
         }

         else if (rows == 2 && (columns == 0 || columns == 3)) {
             System.out.print(" ");
        }

         else if (rows == 3 && (columns == 1 || columns == 2)) {
             System.out.print(" "); 
         }

         else{
             System.out.print(mdArray[rows][columns]);
        }

        }
    }

}
}
