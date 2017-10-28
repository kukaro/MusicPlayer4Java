package main;

public class MusicDto {
	private String path;
	private String name;

	public MusicDto(String path, String name) {
		this.path = path;
		this.name = name;
	}

	public String getFullPath() {
		return path + "/" + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
