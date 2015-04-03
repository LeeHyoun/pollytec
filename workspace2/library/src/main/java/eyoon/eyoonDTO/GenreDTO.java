package eyoon.eyoonDTO;

public class GenreDTO {
	private String genreCode;
	private String genreName;
	
	
	public String getGenreCode() {
		return genreCode;
	}
	public void setGenreCode(String genreCode) {
		this.genreCode = genreCode;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	@Override
	public String toString() {
		return "genreDTO [genreCode=" + genreCode + ", genreName=" + genreName
				+ "]";
	}
	
	
}
