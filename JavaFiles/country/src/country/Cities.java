package country;



public class Cities {
private String name;

public Cities() {
	
}
public Cities(String name) {
	this.name = name;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Cities [name=" + name + "]";
}

}
