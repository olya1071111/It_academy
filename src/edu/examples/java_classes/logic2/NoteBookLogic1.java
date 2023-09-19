package edu.examples.java_classes.logic2;

import java.util.Date;
import java.util.List;

import edu.examples.java_classes.entity.Note;

public interface NoteBookLogic1 {

	void add(Note n);

	List<Note> find(String text);
	
	List<Note> find(Date date);
	
	List<Note> allNotes();

}
