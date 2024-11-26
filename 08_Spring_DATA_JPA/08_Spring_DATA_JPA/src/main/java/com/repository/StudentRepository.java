package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

	/*
	@Query(value="select * from student",nativeQuery=true)
	public List<Student> getAllStudent();
	
	@Query("SELECT s FROM Student s")
	public List<Student> getStudent();
	*/
	@Modifying
    @Transactional
    @Query("DELETE FROM Student WHERE id = :sid")
    public void deleteStudent(Integer sid);

    @Modifying
    @Transactional
    @Query("UPDATE Student SET gender = :gender WHERE id = :sid")
    public void updateStudent(Integer sid, String gender);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Student (s_id, s_name, s_gender) VALUES (:id, :name, :gender)", nativeQuery = true)
    public void insertStudent(Integer id, String name,  String gender);

    @Query("FROM Student")
    public List<Student> selectStudents();
	
	/*
	public List<Student> findByid(Integer sId);
	// Query to select all students with a specific gender
	// select * from student_dtls where student_gender = :gender
	public List<Student> findByGender(String gender);

	// Query to select all students with rank greater than or equal to a specified rank
	// select * from student_dtls where student_rank >= :rank
	public List<Student> findByRankGreaterThanEqual(Long rank);

	// Query to select all students with rank less than or equal to a specified rank
	// select * from student_dtls where student_rank <= :rank
	public List<Student> findByRankLessThanEqual(Long rank);

	// Query to select all male students with a specified minimum rank
	// select * from student_dtls where student_gender = ? and student_rank >= ?
	public List<Student> findByGenderAndRankGreaterThanEqual(String gender, Long rank);
	*/
}
