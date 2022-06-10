package protoLogin;

public class User {
	
	public String username;
	private String password;
		
	//Constructor - nombre de la clase
	public User(){
		System.out.println("Nuevo usuario creado\n");
		this.username = "";
		this.password = "";
		
	}
	
	public User(String username){
		System.out.println("Nuevo usuario creado\n");
		this.username = username;
		this.password = "pass";
		
	}
	
	public User(String username, String password){
		System.out.println("Nuevo usuario creado\n");
		this.username = username;
		this.password = password;
		
	}
	
	public void establecerRol() {
		Administrador admin = new Administrador();
		admin.trabajar();
	}
	
	public class Administrador {		
		public void trabajar() {
			System.out.println("El administrador " + username + " est� currando");
		}
	}
	
	
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
}
