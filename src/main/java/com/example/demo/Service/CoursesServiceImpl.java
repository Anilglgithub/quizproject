package com.example.demo.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Courses;
import com.example.demo.repo.CoursesRepository;

@Service
public class CoursesServiceImpl implements CoursesService {
	@Autowired
	private CoursesRepository courserepo;

	@Override
	public Courses saveCourses(Courses courses) {
		Courses cor=courserepo.save(courses);
         return cor;	
	}

	@Override
	public Courses getcourses(Integer id) {
		Optional<Courses>al=courserepo.findById(id);
		if(al.isPresent()) {
			al.get();
		}
		return null;
	}

	/*@Override
	public List<Courses> getallcourses() {
		return courserepo.findAll();
	}*/

	@Override
	public String deleteall(Integer id) {
		if(courserepo.existsById(id)) {
			courserepo.deleteById(id);
		return"sucessful deleted";
	}
		return "record not found";
	}

	
	/*public List<Courses> getallcourses() {
		// TODO Auto-generated method stub
		return null;
	}*/

}