package com.shiva.StudentOperations;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.shiva.Bean.Student;

public class StudentOperations {
	private JdbcTemplate jdbcTemplate;

    // Constructor Injection
    public StudentOperations(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // INSERT
    public int addStudent(Student student) {
        String sql = "INSERT INTO student VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql,
                student.getId(),
                student.getName(),
                student.getMarks());
    }

    // UPDATE
    public int updateMarks(int id, int marks) {
        String sql = "UPDATE student SET marks=? WHERE id=?";
        return jdbcTemplate.update(sql, marks, id);
    }

    // DELETE
    public int deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }

    // FETCH ONE
    public Student getStudentById(int id) {
        String sql = "SELECT * FROM student WHERE id=?";
        return jdbcTemplate.queryForObject(sql, studentRowMapper(), id);
    }

    // FETCH ALL
    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, studentRowMapper());
    }

    // RowMapper
    private RowMapper<Student> studentRowMapper() {
        return (rs, rowNum) -> {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        };
    }
}

