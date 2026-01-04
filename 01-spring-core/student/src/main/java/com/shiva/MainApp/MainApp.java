package com.shiva.MainApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.shiva.Bean.Student;
import com.shiva.StudentOperations.StudentOperations;

public class MainApp {

	public static void main(String[] args) 
	{
		// Load Spring Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(com.shiva.jdbc.jdbcConfig.class);

        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        StudentOperations ops = new StudentOperations(jdbcTemplate);

        // ADD
        //ops.addStudent(new Student(2, "ShivaKumar", 77));

        // UPDATE
        ops.updateMarks(1, 90);

        // FETCH ONE
        //System.out.println(ops.getStudentById(2));

        // FETCH ALL
        ops.getAllStudents().forEach(System.out::println);

        // DELETE
        //ops.deleteStudent(2);

        context.close();
    }


	}


