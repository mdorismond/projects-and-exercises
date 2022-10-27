package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		Project project = null;
		String sqlGetProject = "SELECT project_id, name, from_date, to_date FROM project WHERE project_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetProject, projectId);
		if (results.next()) {
			project = MapRowToProject(results);
		}
		return project;
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> allProjects = new ArrayList<>();
		String sqlGetAllProjects = "SELECT project_id, name, from_date, to_date FROM project";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllProjects);
		while (results.next()) {
			Project project = MapRowToProject(results);
			allProjects.add(project);
		}

		return allProjects;
	}


	@Override
	public Project createProject(Project newProject) {
		String sql = "INSERT INTO project( name, from_date, to_date) VALUES (?, ?, ?) RETURNING project_id";
		int rowsInserted = jdbcTemplate.queryForObject(sql, Integer.class, newProject.getName(), newProject.getFromDate(), newProject.getToDate());
		return getProject(rowsInserted);
	}

	@Override
	public void deleteProject(int projectId) {
		String sql = "DELETE FROM project_employee WHERE project_id = ?";
		jdbcTemplate.update(sql, projectId);
		sql = "DELETE FROM project WHERE project_id = ?";

		jdbcTemplate.update(sql, projectId);
	}

	private Project MapRowToProject(SqlRowSet rowSet) {
		Project project = new Project();
		project.setId(rowSet.getInt("project_id"));
		project.setName(rowSet.getString("name"));
		if (rowSet.getDate("from_date") != null)
			project.setFromDate(rowSet.getDate("from_date").toLocalDate());
		if (rowSet.getDate("to_date") != null)
			project.setToDate(rowSet.getDate("to_date").toLocalDate());
		return project;

	}
}
	


