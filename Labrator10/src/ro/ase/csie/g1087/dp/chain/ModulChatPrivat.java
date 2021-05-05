package ro.ase.csie.g1087.dp.chain;

public class ModulChatPrivat extends NodChainAbstract {

	public static final String NUME_MODUL = "Modul chat privat";
	
	public ModulChatPrivat() {
		super(NUME_MODUL);
		
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		
		if(mesaj.getDestinatie().isEmpty() 
				|| mesaj.getDestinatie().equals("@Everyone")) {
			if(this.next!= null)
				this.next.procesareMesajChat(mesaj);
			
		}
		else
		{
			System.out.println(String.format("msj priv pt %s = %s ", mesaj.getContinut()));
			
		}
		
	}
	

}
