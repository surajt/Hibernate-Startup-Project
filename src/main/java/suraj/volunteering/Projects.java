package suraj.volunteering;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="projects")
public class Projects {
	
	@Id
	@GeneratedValue 
	private int id;
	
	
	
}
