package ro.ase.csie.cts.g1087.dp.proxy;

import java.nio.channels.UnsupportedAddressTypeException;
import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataModulLogin {

	InterfataModulLogin modulLogin= null;
	
	public static final int NR_MAX_INCERCARI = 3;
	public Map<String,Integer> nrIncercari = new HashMap<>();
	
	@Override
	public boolean login(String username, String pass) {
		int nrIncercariNereusite = nrIncercari.get(username);
		if (nrIncercariNereusite == null) {
			nrIncercari.put(username, 0);
			nrIncercariNereusite = 0;
		}
	

		if (modulLogin != null) {
			if (nrIncercariNereusite < NR_MAX_INCERCARI) {
				if (modulLogin.login(username, pass) == true) {
					nrIncercariNereusite=0;
					return true;
					}
				else {
					nrIncercariNereusite += 1;
					nrIncercari.put(username,nrIncercariNereusite);
					return false;
				}
			} else
				return false;
		} else
			throw new UnsupportedOperationException();
	}

	@Override
	public boolean verificaStatusServer() {
		if(modulLogin!= null)
			return modulLogin.verificaStatusServer();
		else
			throw new UnsupportedOperationException();
	}

	public ProxyLogin(InterfataModulLogin modulLogin) {
		super();
		this.modulLogin = modulLogin;
	}

	
}
