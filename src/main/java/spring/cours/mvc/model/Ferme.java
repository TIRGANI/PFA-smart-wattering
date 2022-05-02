package spring.cours.mvc.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ferme")
public class Ferme {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private int numParcel;
	private String photo;
	
	
	public Ferme(int id, int numParcel, String img) {
		super();
		this.id = id;
		this.numParcel = numParcel;
		this.photo = img;
	}
	public Ferme() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumParcel() {
		return numParcel;
	}
	public void setNumParcel(int numParcel) {
		this.numParcel = numParcel;
	}
	public String getImg() {
		return photo;
	}
	public void setImg(String img) {
		this.photo = img;
	}
	
	 

}
