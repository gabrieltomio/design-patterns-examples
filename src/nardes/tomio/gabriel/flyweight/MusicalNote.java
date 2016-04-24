package nardes.tomio.gabriel.flyweight;

enum MusicalNote {
	
	DO(new Do()),
	FA(new Fa()),
	LA(new La()),
	MI(new Mi()),
	RE(new Re()),
	SI(new Si()),
	SOL(new Sol());
	
	private Note notaMusical;
	
	MusicalNote(final Note musicalNote) {
		this.notaMusical = musicalNote;
	}
	
	public Note getNote() {
		return this.notaMusical;
	}
}