package Model;

public class CategoryModel extends AbstractModel<CategoryModel> {
	
	private int id_category;
	private String code;
	private String name;
	
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id) {
		this.id_category = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
