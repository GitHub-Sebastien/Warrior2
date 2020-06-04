package warrior2;

public class MovePlayerException extends Exception {
	public MovePlayerException() {
		super("Vous avez depassé la taille du plateau, vous avez fiini la partie");
	}

	@Override
	public String getMessage() {
		String msg = "Error MovePlayerException :  " + super.getMessage();
		return msg;
	}
	
	

}
