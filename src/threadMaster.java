
public class threadMaster extends Thread {
	int[] charNumbers;
	String password;
	StringBuilder cracker;
	int x;

	public void run() {
            if (charNumbers[x] >= 127){
                charNumbers[x] = 33;
                if (x != password.length() - 1){
                    charNumbers[x + 1] += 1;
                    cracker.setCharAt((x + 1), (char) charNumbers[x + 1]);
                }
                cracker.setCharAt(x, (char) charNumbers[x] );
            }
        
	}
}
