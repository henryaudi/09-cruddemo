package com.springproject.cruddemo.dao;

import com.springproject.cruddemo.entity.Instructor;
import com.springproject.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);
}
