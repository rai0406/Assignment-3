package Robomq;

public class Election implements Comparable<Election>{

	private int eid;
	private String name;
	private int date;
	private String District;
	private String constituency;
	private int cdate;


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Election other = (Election) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Election(int eid, String name, int date, String district, String constituency, int cdate) {
		super();
		this.eid = eid;
		this.name = name;
		this.date = date;
		District = district;
		this.constituency = constituency;
		this.cdate = cdate;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public int getCdate() {
		return cdate;
	}
	public void setCdate(int cdate) {
		this.cdate = cdate;
	}
	@Override
	public String toString() {
		return "\nElection [eid=" + eid + ", name=" + name + ", date=" + date + ", District=" + District
				+ ", constituency=" + constituency + ", cdate=" + cdate + "]";
	}
	 @Override 
	 public int compareTo(Election p) {
		  
		  int s=this.eid-p.eid; return s;
		  
		  }
	
	
}
