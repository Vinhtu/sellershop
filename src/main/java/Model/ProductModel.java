package Model;

public class ProductModel {
	   private int id_proudct;
	   private String name;
	   private String img;
	   private String caption;
	   private String content;
	   private String promotion;
	   private String description;
	   private String categories;
	   private String date;
	   private long[] arrId;
	public int getId_product() {
		return id_proudct;
	}
	public void setId_product(int id_product) {
		this.id_proudct = id_product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPromotion() {
		return promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long[] getArrId() {
		return arrId;
	}
	public void setArrId(long[] arrId) {
		this.arrId = arrId;
	}
	   

}
