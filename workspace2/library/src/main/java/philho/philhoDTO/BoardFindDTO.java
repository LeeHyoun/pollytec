package philho.philhoDTO;

public class BoardFindDTO {
	
		private String searchFiled;
		private String searchValue;
		public String getSearchFiled() {
			return searchFiled;
		}
		public void setSearchFiled(String searchFiled) {
			this.searchFiled = searchFiled;
		}
		public String getSearchValue() {
			return searchValue;
		}
		public void setSearchValue(String searchValue) {
			this.searchValue = searchValue;
		}
		@Override
		public String toString() {
			return "BoardFindDTO [searchFiled=" + searchFiled
					+ ", searchValue=" + searchValue + "]";
		}
}
