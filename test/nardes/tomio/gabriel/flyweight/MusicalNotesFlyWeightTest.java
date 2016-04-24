package nardes.tomio.gabriel.flyweight;

import org.junit.Assert;
import org.junit.Test;


public class MusicalNotesFlyWeightTest {

	@Test
	public void testGetNote01() throws Exception {
		Note note1 = MusicalNotesFlyWeight.getNote(MusicalNote.DO);
		Note note2 = MusicalNotesFlyWeight.getNote(MusicalNote.DO);
		
		Assert.assertEquals(note1, note2);
	}

}
