package Model;

public class RoleModel extends AbstractModel<RoleModel>{
	private int id_role;
	private String code;
	private String name;
	public int getId_role() {
		return id_role;
	}
	public void setId_role(int id_role) {
		this.id_role = id_role;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String string) {
		this.code = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
