import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Course;
import com.avengers.luadingo.service.CourseService;

import java.util.*;

@RestController
@RequestMapping("/Course")
@CrossOrigin
public class CourseController{
    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public String add(@RequestBody Course course){
        courseService.save(course);
        return "New Course is added";
    }

    @GetMapping("/getAll")
    public List<Course> getAllCourses(){
        return courseService.getAll();
    }

    @GetMapping("/{course_id}")
    public ResponseEntity<Course> get(@PathVariable int course_id){
       try{
        Course course = courseService.get(course_id);
        return new ResponseEntity<Course>(course, HttpStatus.OK);
       }
       catch(NoSuchElementException e){
        return new ResponseEntity<Course>(HttpStatus.NOT_FOUND);
       }
    }

    @PutMapping("/{course_id}")
    public ResponseEntity<Course> update(@RequestBody Course course, @PathVariable int course_id){
       try{
        Course existingCourse = courseService.get(course_id);
        courseService.delete(course_id);
        courseService.save(course);
        return new ResponseEntity<Course>(course, HttpStatus.OK);
       }
       catch(NoSuchElementException e){
        return new ResponseEntity<Course>(HttpStatus.NOT_FOUND);
       }
    }
}