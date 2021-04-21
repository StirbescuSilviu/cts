package ro.ase.csie.cts.g1087.dp.proxy;

public class TextProxy {

	public static void main(String[] args) {
		InterfataModulLogin login = new ModulLogin("10.0.0.1", 127);
	//	ModulLogin login = new ModulLogin("10.0.0.1", 127);
		
		login = new ProxyLogin(login);
		if(login.login("admin", "admin12"))
			System.out.println("Hello admin");
		
		String[] parole = new String[]{"1234","123456","admin","root","admin12"};
	
	
	for(String parola : parole) {
		if(login.login("admin",parola))
			System.out.println("Parola:"+ parola);
	}

		System.out.println("logout");
	}
}
