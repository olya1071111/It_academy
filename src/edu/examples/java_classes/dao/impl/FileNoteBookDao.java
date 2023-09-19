package edu.examples.java_classes.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import edu.examples.java_classes.dao.NoteBookDao;
import edu.examples.java_classes.entity.Note;

public class FileNoteBookDao implements NoteBookDao  {

	@Override
	public void save(Note n) {
		BufferedWriter bufWriter = null;
		try {
			bufWriter = new BufferedWriter(new FileWriter("resources/notes.txt", true));
			bufWriter.write(n.getId() + " " + n.getD() + " " + n.getTitle() + " " + n.getContent());
			bufWriter.close();
		} catch (IOException e) {
			System.err.println("File handling error!!!");
		}
	}

	@Override
	public List<Note> allNotes() {
		List<Note> listNote = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader("resources/notes.txt"))) {
			while (reader.ready()) {
				listNote.add(reader.readLine());
			}
			reader.close();
		} catch (IOException e) {
			System.err.println("Don't find file!!!");
		}

		return listNote;

	}
}
