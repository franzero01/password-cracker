
public class threadMaster extends Thread {
	public void run(int x, int[] charNumbers, String password, StringBuilder cracker) {
		try {
			if (charNumbers[x] == 127){
                charNumbers[x] = 33;
                if (x != password.length() - 1){
                    charNumbers[x + 1] += 1;
                    cracker.setCharAt((x + 1), (char) charNumbers[x + 1]);
                }
                cracker.setCharAt(x, (char) charNumbers[x] );
            }
		} catch (Exception e) {
			System.out.println("There was a problem");
			e.printStackTrace();
		}
	}
}
