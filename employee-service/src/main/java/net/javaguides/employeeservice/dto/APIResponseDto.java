package net.javaguides.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private EmployeeDto employee;
    private DepartmentDto department;
    private OrganizationDto organization;
	public EmployeeDto getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeDto employee) {
		this.employee = employee;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public OrganizationDto getOrganization() {
		return organization;
	}
	public void setOrganization(OrganizationDto organization) {
		this.organization = organization;
	}
	public APIResponseDto(EmployeeDto employee, DepartmentDto department, OrganizationDto organization) {
		super();
		this.employee = employee;
		this.department = department;
		this.organization = organization;
	}
	public APIResponseDto() {
		super();
	}
	@Override
	public String toString() {
		return "APIResponseDto [employee=" + employee + ", department=" + department + ", organization=" + organization
				+ "]";
	}
    
    
}
