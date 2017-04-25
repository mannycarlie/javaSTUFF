package PatientRecord;

import java.sql.Date;

public class Patient {

	String patientid;
	String lastname;
	String firstname;
	Date dob;
	String address;
	String county;
	String town;


	public Patient(String patientid, String lastname, String firstname, Date dob, String address, String county,
			String town) {
		super();
		this.patientid = patientid;
		this.lastname = lastname;
		this.firstname = firstname;
		this.dob = dob;
		this.address = address;
		this.county = county;
		this.town = town;
	}


	public String getPatientid() {
		return patientid;
	}


	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCounty() {
		return county;
	}


	public void setCounty(String county) {
		this.county = county;
	}


	public String getTown() {
		return town;
	}


	public void setTown(String town) {
		this.town = town;
	}


	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", lastname=" + lastname + ", firstname=" + firstname + ", dob="
				+ dob + ", address=" + address + ", county=" + county + ", town=" + town + "]";
	}


}
