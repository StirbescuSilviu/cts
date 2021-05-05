package ro.ase.csie.g1087.dp.chain;


public class TestChain {

	public static void main(String[] args) {

		NodChainAbstract chatGlobal = new ModulChatGlobal();
		NodChainAbstract chatPrivat = new ModulChatPrivat();
		NodChainAbstract filtruChat = new ModulFIltru("reguli lb romana");
	
		filtruChat.setNext(chatPrivat);
		chatPrivat.setNext(chatGlobal);
		
		NodChainAbstract serverChat = filtruChat;
		
		serverChat.procesareMesajChat(new MesajChat("@Everyone", "esti rau", 1));
		serverChat.procesareMesajChat(new MesajChat("@Everyone", "esti ok", 1));
		serverChat.procesareMesajChat(new MesajChat("@Gigel", "hai sa incercam nivelul 5", 1));
	}

}
