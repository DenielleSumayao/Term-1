public class App {
    public static void main(String[] args) throws Exception {

        // Table
        char [][] mdArray = {{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'}};

        // Outer loop
        for (int rows = 0; rows < 4; rows++) {

          System.out.println(" ");  
            // inner loop
            for (int columns = 0; columns < 3; columns++) {
                    System.out.println(mdArray[rows][columns]);

                    // if row is odd print blank
                    if (rows % 2 != 0) {
                        System.out.println(" ");
                    }
                    else {
                        System.out.println(mdArray[rows][columns]);
                    }
            }   
        }
    }
}
