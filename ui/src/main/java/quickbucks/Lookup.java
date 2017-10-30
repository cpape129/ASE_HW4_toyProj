package quickbucks;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Lookup{
	private int id;
	
	public void setID(int id){
			this.id = id;
	}
	public int getID(){return this.id;}
}
