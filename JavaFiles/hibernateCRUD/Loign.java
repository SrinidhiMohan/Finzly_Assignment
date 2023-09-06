package hibernateCRUD;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Loign {
	
int id;
String username;
String password;

@Override
public String toString() {
	return "Loign [id=" + id + ", username=" + username + ", password=" + password + "]";
}

@Id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
