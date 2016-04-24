package nardes.tomio.gabriel.flyweight;

import java.util.HashMap;
import java.util.Map;

class MusicalNotesFlyWeight {
	
	private static Map<MusicalNote, Note> notes = new HashMap<>();

	public static Note getNote(MusicalNote note) {

		if (notes.containsKey(note)) {
			return notes.get(note);
		}

		notes.put(note, note.getNote());
		return notes.get(note);
	}
}
