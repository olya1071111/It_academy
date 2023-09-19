package edu.examples.java_classes.logic2;

import edu.examples.java_classes.logic.NotebookLogic;

public final class LogicProvider {
	private static final LogicProvider INSTANCE = new LogicProvider();
	
	private LogicProvider() {}
	
	private NoteBookLogic1 noteBookLogic = new NotebookLogic();
		
	public NoteBookLogic1 getNoteBookLogic() {
		return noteBookLogic;
	}

	public static LogicProvider getInstance() {
		return INSTANCE;
	}
}
