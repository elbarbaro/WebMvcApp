package com.barbaro.webmvcapp.dao;

import com.barbaro.webmvcapp.domain.Student;
import com.barbaro.webmvcapp.dto.StudentDto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    /*@PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }*/

    @Override
    public void save(StudentDto student) {
        Student mockStudent = new Student();
        student.setCode(student.getCode());
        student.setCode(student.getApePaterno());
        student.setCode(student.getApeMaterno());
        student.setName(student.getName());
        student.setName(student.getBirthDate());
        entityManager.persist(mockStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("FROM Student").getResultList();
    }

    @Override
    public long count() {
        return entityManager.createQuery("FROM Student").getResultList().size();
    }

    /*@Override
    public void delete(StudentDto student) {
        entityManager.remove(student);
    }*/
}
