public class Author{
	
	private String name;
	private String email;
	private char gender;

	/*
	constructor for object of class author	
	*/
	public Author(String name,String email, char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;

		if((gender == 'l') || (gender == 'L') || (gender == 'p') || (gender == 'P')){
     	 this.gender = gender;
		}else{
      	this.gender = 'L';
		}
	}
	public String getname(){
		return this.name;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public char getgender(){

		return this.gender;
	}

	public String toString(){
		return this.name + "("+this.gender+")at " + this.email;
	}
}