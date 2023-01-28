package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentID;
	private String departmentName, departmentAdress, departmentCode;

	public Long getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Long departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAdress() {
		return departmentAdress;
	}

	public void setDepartmentAdress(String departmentAdress) {
		this.departmentAdress = departmentAdress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Department(Long departmentID, String departmentName, String departmentAdress, String departmentCode) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.departmentAdress = departmentAdress;
		this.departmentCode = departmentCode;
	}

	public Department() {

	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + ", departmentAdress="
				+ departmentAdress + ", departmentCode=" + departmentCode + "]";
	}

}
