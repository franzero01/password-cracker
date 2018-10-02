
public class threadMaster extends Thread {
	public void run(ultra cracker) {
		try {
			cracker.crackPassword();
		} catch (Exception e) {
			System.out.println("There was a problem");
			e.printStackTrace();
		}
	}
}
