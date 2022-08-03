package com.mjstafford.abstractart;

public class Sculpture extends Art {
	private String material;
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}

	@Override
	void viewArt() {
		String details = "Viewing Scuplture: " + this.getTitle();
		details += "\nAuthor: " + this.getAuthor();
		details += "\nDescription: " + this.getDescription();
		details += "\nMaterial: " + this.material;
		System.out.println(details);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
