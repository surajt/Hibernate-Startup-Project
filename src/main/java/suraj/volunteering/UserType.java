package suraj.volunteering;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usertype") 
public class UserType {
	
	@Id
	@GeneratedValue 
	private int id;
	
	private String type;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usertype")
	private Set<Users> usersRecord = new HashSet<Users>();

	public Set<Users> getUsersRecord() {
		return usersRecord;
	}

	public void setUsersRecord(Set<Users> usersRecord) {
		this.usersRecord = usersRecord;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserType other = (UserType) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}
