

import java.util.Vector;

public class NoteBook {
	private Vector<Note> notes;

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
