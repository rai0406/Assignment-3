package Robomq;

public class Author {

	private int id;
	private String author,address;
	
	public Author(int id,String author,String address)
	{
		this.id=id;
		this.author=author;
		this.address=address;
	}
	public int getId() //getter for private property
	{
		return id;
	}
	public void setId(int id)//setter for private property
	{
		this.id=id;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	
	public String getadd() {
		return address;
	}
	public void setadd(String address) {
		this.address=address;
	}
	public String toString()
	{
		return "\nBook Id : "+id+" Author : "+author+" Address : "+address;
	}
}
