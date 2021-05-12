package ro.ase.csie.g1087.dp.command;

import ro.ase.csie.cts.g1087.dp.command.InterfataModulJoc;
import ro.ase.csie.cts.g1087.dp.command.TaskAsincron;

public class TaskToDo extends TaskAsincron {

	InterfataModulJoc modulJoc = null;
	String info;
	int prioritate;
	
	
	public TaskToDo(InterfataModulJoc modulJoc, String info, int prioritate) {
		super();
		this.modulJoc = modulJoc;
		this.info = info;
		this.prioritate = prioritate;
	}

	@Override
	public void executaTask() {
		if(this.modulJoc != null)
			this.modulJoc.executaActiune(info);
		else
			throw new UnsupportedOperationException();
	}

}
