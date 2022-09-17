package com.zkzong.mybatis.service;

import com.zkzong.mybatis.domain.Tutor;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Zong on 2017/3/11.
 */
public class TutorServiceTest {
    private static TutorService tutorService;

    @BeforeClass
    public static void setUp() throws Exception {
        tutorService = new TutorService();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        tutorService = null;
    }

    @Test
    public void findAllTutors() {
        List<Tutor> tutors = tutorService.findAllTutors();
        assertNotNull(tutors);
        for (Tutor tutor : tutors) {
            System.out.println(tutor);
        }
    }

    @Test
    public void findTutorById() {
        Tutor tutor = tutorService.findTutorById(1);
        assertNotNull(tutor);
        System.out.println(tutor);
    }

    @Test
    public void findTutorByNameAndEmail() {
        Tutor tutor = tutorService.findTutorByNameAndEmail("Paul", "paul@gmail.com");
        assertNotNull(tutor);
        System.out.println(tutor);
    }

    @Test
    public void createTutor() {
        Tutor tutor = new Tutor();
        tutor.setName("siva");
        tutor.setEmail("siva@gmail.com");
        tutor = tutorService.createTutor(tutor);
        assertNotNull(tutor);
        System.out.println(tutor);
    }

    @Test
    public void updateTutor() {
        Tutor tutor = new Tutor();
        tutor.setTutorId(1);
        tutor.setName("sivaprasad");
        tutor.setEmail("sivaprasad@gmail.com");
        tutor = tutorService.updateTutor(tutor);
        Tutor updtutor = tutorService.findTutorById(1);
        assertNotNull(tutor);
        System.out.println(tutor);
    }

    @Test
    public void deleteTutor() {
        boolean deleted = tutorService.deleteTutor(4);
        assertTrue(deleted);
    }

    @Test
    public void selectTutorById() {
        Tutor tutor = tutorService.selectTutorById(1);
        assertNotNull(tutor);
        System.out.println(tutor);
    }

    @Test
    public void selectTutorWithCoursesById() {
        Tutor tutor = tutorService.selectTutorWithCoursesById(1);
        assertNotNull(tutor);
        System.out.println(tutor);
    }

}