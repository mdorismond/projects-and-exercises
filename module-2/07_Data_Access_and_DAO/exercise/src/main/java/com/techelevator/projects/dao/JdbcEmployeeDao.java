package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployees = new ArrayList<>();
		String sqlGetAllEmployees = "SELECT employee.employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllEmployees);
		while (results.next()) {
			Employee employeeResult = mapRowToEmployee(results);
			allEmployees.add(employeeResult);
		}
		return allEmployees;
	}




	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employeesByName = new ArrayList<>();
		String sqlSearchEmployeesByName = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee WHERE first_name ILIKE ? AND last_name ILIKE ? ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchEmployeesByName, "%" + firstNameSearch + "%", "%" + lastNameSearch + "%");
		while(results.next()) {
			Employee employeeName = mapRowToEmployee(results);
			employeesByName.add(employeeName);
		}
		return employeesByName;
	}


	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		List<Employee> employeeByProject = new ArrayList<Employee>();
		String sqlFindEmployeesByProjectId = "SELECT employee.employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee JOIN project_employee ON employee.employee_id = project_employee.employee_id WHERE project_id = ? ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindEmployeesByProjectId, projectId);
		while(results.next()) {
			Employee employeeProjectId = mapRowToEmployee(results);
			employeeByProject.add(employeeProjectId);
		}
		return employeeByProject;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		String sql = "INSERT INTO project_employee(project_id,employee_id) VALUES ( ?, ? )";
		jdbcTemplate.update(sql,projectId,employeeId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		String sql = "DELETE FROM project_employee WHERE employee_id = ? AND project_id = ?";
			jdbcTemplate.update(sql, employeeId,projectId);
		}


	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employeesWithoutProjects = new ArrayList<Employee>();
		String sqlGetEmployeesWithoutProjects = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee WHERE employee_id NOT IN (SELECT DISTINCT employee_id FROM project_employee) ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesWithoutProjects);
		while(results.next()) {
			Employee benchEmployee = mapRowToEmployee(results);
			employeesWithoutProjects.add(benchEmployee);
		}
		return employeesWithoutProjects;
	}


	private Employee mapRowToEmployee(SqlRowSet results) {
		Employee employee;
		employee = new Employee();
		employee.setId(results.getInt("employee_id"));
		employee.setDepartmentId(results.getInt("department_id"));
		employee.setFirstName(results.getString("first_name"));
		employee.setLastName(results.getString("last_name"));
		employee.setBirthDate(results.getDate("birth_date").toLocalDate());
		employee.setHireDate(results.getDate("hire_date").toLocalDate());
		return employee;
	}
	}



