/**
 * Created by frank on 1/27/2017.
 */
public class ultra {
    //variables
    private String password;
    private String atttempt;

    //constructor
    public ultra(){}
    public ultra(String userPassword){
        setPassword(userPassword);
    }

    //setters
    public void setPassword(String userPassword){
        password = userPassword;
    }

    // getters
    /**public String getAtttempt(){
     }*/

    //modifier
    public void crackPassword(){
        StringBuilder cracker = new StringBuilder();
        int[] charNumbers = new int[password.length()];
        charNumbers[0] = 97;
        cracker.setLength(password.length());
        int attemptCounter = 0;
        long tStart = System.currentTimeMillis();
        long tEnd;

        for (int y = 0; y < charNumbers.length; y++){
            charNumbers[y] = 97;
        }

        while (!cracker.toString().equals(password)) {

            if (cracker.toString().equals(password)) { //stop program if password is found
                break;
            }
            charNumbers[0]++;
            cracker.setCharAt(0, (char) charNumbers[0]);

            if ((attemptCounter % 100000000) == 0){
                System.out.println("Workinng....\n" + attemptCounter);
            }

            for (int x = 0; x < password.length(); x++){ //reset letter counter and advance the next letter.
                if (charNumbers[x] == 123){
                    charNumbers[x] = 97;
                    if (x != password.length() - 1){
                        charNumbers[x + 1] += 1;
                        cracker.setCharAt((x + 1), (char) charNumbers[x + 1]);
                    }
                    cracker.setCharAt(x, (char) charNumbers[x] );
                }
            }
            attemptCounter++;

            /*System.out.println(attemptCounter);
            System.out.println(cracker.toString());*/
        }
        System.out.println(cracker.toString());
        tEnd = System.currentTimeMillis();
        System.out.println((tEnd - tStart) / 1000.0);
        System.out.println(attemptCounter);
    }
}