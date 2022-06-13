package hibernate1;

import javax.persistence.GenerationType;

//plane old java 

@Entity
public class UserDetails {
	@Id
	
	private int id;
	private String name;
	@Column(name="uid")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id =id;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
}
