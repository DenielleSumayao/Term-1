public class assignment2 {
    public static void main(String[] args) throws Exception {
        
        // Use a while loop to print your FIRSTNAME three times.

        int countOne = 0;

        while (countOne != 3) {
            System.out.println("Luke Denielle");
            countOne ++;
        }

        // Use a do-while loop to print your MIDDLENAME four times.

        int countTwo = 0;

        do {
            System.out.println("Lingat");
            countTwo ++;
        } while (countTwo != 4);

     
        // Use a for loop to print your SURNAME five times.

        for (int countThree = 0; countThree != 5; countThree ++) {
            System.out.println("Sumayao");
        }
        
        // Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME.

        char firstname[] = {'L', 'U', 'K', 'E', 'D', 'E', 'N', 'I', 'E', 'L', 'L', 'E'};

        for (int countEleven = 0; countEleven != firstname.length; countEleven ++) {
            System.out.print(firstname[countEleven]);
        }
        
        
        System.out.println();
        // Use a for loop to print the char array of your FIRSTNAME in REVERSE order

        
        for (int countFive = 11; countFive > -1; countFive --) {
            System.out.print(firstname[countFive]);
        }

    }
}
