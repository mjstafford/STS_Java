package com.mjstafford.abstractart;

public class Painting extends Art {
	private String paintType;

	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.setPaintType(paintType);
	}

	@Override
	public void viewArt() {
		String details = "Viewing Painting: " + this.getTitle();
		details += "\nAuthor: " + this.getAuthor();
		details += "\nDescription: " + this.getDescription();
		details += "\nPaint Type: " + this.paintType;
		System.out.println(details);
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

}
