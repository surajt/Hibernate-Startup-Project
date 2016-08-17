package suraj.volunteering;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue 
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type_id", nullable=false)
	private UserType userType;
	
	private String fullName; 
	private String email;
	private String address; 
	private String pwd; 
	private String gender; 
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastlogin; 
	
	private int is_active; 
	private String forgotToken;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getLastlogin() {
		return lastlogin;
	}
	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}
	public int getIs_active() {
		return is_active;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	public String getForgotToken() {
		return forgotToken;
	}
	public void setForgotToken(String forgotToken) {
		this.forgotToken = forgotToken;
	} 
	

	
	
}
