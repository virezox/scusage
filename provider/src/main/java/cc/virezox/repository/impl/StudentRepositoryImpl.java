package cc.virezox.repository.impl;

import cc.virezox.entity.Student;
import cc.virezox.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private Map<Long, Student> studentMap;

    public StudentRepositoryImpl() {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"Jack","Male"));
        studentMap.put(2L,new Student(2L,"Lucy","Female"));
        studentMap.put(3L,new Student(3L,"Tom","Male"));
    }


    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}
