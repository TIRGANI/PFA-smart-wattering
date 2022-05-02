package spring.cours.mvc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User  {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String username;
    private String password;
    private String email;
    @ManyToOne(cascade = CascadeType.PERSIST)
	private Role role;
    @ManyToOne(cascade = CascadeType.PERSIST)
	private Ferme ferme;
    
    public User() {
		
	}
    
    public User(Integer userId, String username, String password, String email, Role role, Ferme ferme) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		this.ferme = ferme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Ferme getFerme() {
		return ferme;
	}
	public void setFerme(Ferme ferme) {
		this.ferme = ferme;
	}
	public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
   
    public void setUsername(String username) {
        this.username = username;
    }
   
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}