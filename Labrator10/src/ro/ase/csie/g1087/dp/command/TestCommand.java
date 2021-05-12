package ro.ase.csie.g1087.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		
		TaskAsincron autoSave = new TaskToDo(new ModulAutoSave(), "autosave", 5);
		TaskAsincron autoUpdate = new TaskToDo(new ModulUpdateClient(), "update v2", 20);
	
		//executie taskuri asincrone
		autoSave();
		autoUpdate.executaTask();
		
	}

}
