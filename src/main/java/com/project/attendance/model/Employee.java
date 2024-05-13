package com.project.attendance.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("employeeData")
public class Employee {
		
		@Id
		private String empId;
		private String empName;
		private Double empSalary;
		private String empNumber;
		private String empTeamId;
		private String empManagerName;
		private String empManagerId;
		private String empRole;
		private String empTeamName;
		private Boolean empIsAdmin;
		
		
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		public String getEmpId() {
			return empId;
		}



		public void setEmpId(String empId) {
			this.empId = empId;
		}



		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		
		public Double getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(Double empSalary) {
			this.empSalary = empSalary;
		}
		
		public String getEmpNumber() {
			return empNumber;
		}
		public void setEmpNumber(String empNumber) {
			this.empNumber = empNumber;
		}
		
		public String getEmpTeamId() {
			return empTeamId;
		}
		public void setEmpTeamId(String empTeamId) {
			this.empTeamId = empTeamId;
		}
		
		public String getEmpManagerName() {
			return empManagerName;
		}
		public void setEmpManagerName(String empManagerName) {
			this.empManagerName = empManagerName;
		}
		
		public String getEmpManagerId() {
			return empManagerId;
		}
		public void setEmpManagerId(String empManagerId) {
			this.empManagerId = empManagerId;
		}
		public String getEmpRole() {
			return empRole;
		}
		public void setEmpRole(String empRole) {
			this.empRole = empRole;
		}
		public String getEmpTeamName() {
			return empTeamName;
		}
		public void setEmpTeamName(String empTeamName) {
			this.empTeamName = empTeamName;
		}
		public Boolean getEmpIsAdmin() {
			return empIsAdmin;
		}
		public void setEmpIsAdmin(Boolean empIsAdmin) {
			this.empIsAdmin = empIsAdmin;
		}

		@Override
		public String toString() {
			return "Admin [empName=" + empName + ", empSalary=" + empSalary + ", empNumber=" + empNumber
					+ ", empTeamId=" + empTeamId + ", empManagerName=" + empManagerName + ", empManagerId="
					+ empManagerId + ", empRole=" + empRole + ", empTeamName=" + empTeamName + ", empIsAdmin="
					+ empIsAdmin + "]";
		}

		
	

}
