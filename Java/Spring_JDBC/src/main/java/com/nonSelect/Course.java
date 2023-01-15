package com.nonSelect;

public class Course {

	private String sname;
	private int sid;
	private String strainer;
	private int sfee;
	private int sduration;
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}


	public Course(String sname, int sid, String strainer, int sfee, int sduration) {
		this.sname = sname;
		this.sid = sid;
		this.strainer = strainer;
		this.sfee = sfee;
		this.sduration = sduration;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getStrainer() {
		return strainer;
	}


	public void setStrainer(String strainer) {
		this.strainer = strainer;
	}


	public int getSfee() {
		return sfee;
	}


	public void setSfee(int sfee) {
		this.sfee = sfee;
	}


	public int getSduration() {
		return sduration;
	}


	public void setSduration(int sduration) {
		this.sduration = sduration;
	}


	@Override
	public String toString() {
		return "Course [sname=" + sname + ", sid=" + sid + ", strainer=" + strainer + ", sfee=" + sfee + ", sduration="
				+ sduration + "]";
	}
	
	
	
}
