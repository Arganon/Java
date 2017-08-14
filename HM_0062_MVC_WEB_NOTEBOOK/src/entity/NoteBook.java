package entity;

import java.util.Vector;

public class NoteBook implements NoteMaker {
	private Vector<Note> notes;
	
	@Override
	public Note makeNote() {
		return new Note();
	}

	public NoteBook() {
		this.notes = new Vector<Note>();
	}

	public void addNote(Note note) {
		this.notes.add(note);
	}

	 public Note deleteNote(int index) {
		 Note note = notes.get(index);
		 notes.remove(index);
		 return note;
	 }

	 public Note getNote(int index) {
		 Note note = notes.get(index);
		 return note;
	 }
}
