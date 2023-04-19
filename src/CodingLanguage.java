public class CodingLanguage {
	private String name;
	private int createdDate;
	private String creator;

	public CodingLanguage(String name, int createdDate, String creator) {
		this.name = name;
		this.createdDate = createdDate;
		this.creator = creator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(int createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
}
