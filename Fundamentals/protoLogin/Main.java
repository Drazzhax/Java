package protoLogin;

public class Main {

	public static void main(String[] args) {
		
		User usuario = new User();
		usuario.establecerRol();
		remember(usuario.getPassword(), usuario.getUsername());
	}
	
	private static void remember(String pass, String user) {
		System.out.println("Your user is: " + user);
		System.out.println("Your password is: " + pass);
	}

}
