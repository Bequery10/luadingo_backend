import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Has_Question;
import com.avengers.luadingo.model.Has_QuestionPK;
import com.avengers.luadingo.service.Has_QuestionService;

import java.util.*;

@RestController
@RequestMapping("/Has_Question")
@CrossOrigin
public class Has_QuestionController{
    @Autowired
    private Has_QuestionService has_questionService;

    @PostMapping("/add")
    public String add(@RequestBody Has_Question has_question){
        has_questionService.save(has_question);
        return "New Has_Question is added";
    }

    @GetMapping("/getAll")
    public List<Has_Question> getAllHas_Questions(){
        return has_questionService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Has_Question> get(@PathVariable Has_QuestionPK id){
       try{
        Has_Question has_question = has_questionService.get(id);
        return new ResponseEntity<Has_Question>(has_question, HttpStatus.OK);
       }
       catch(NoSuchElementException e){
        return new ResponseEntity<Has_Question>(HttpStatus.NOT_FOUND);
       }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Has_Question> update(@RequestBody Has_Question has_question, @PathVariable Has_QuestionPK id){
       try{
        Has_Question existingHas_Question = has_questionService.get(id);
        has_questionService.delete(id);
        has_questionService.save(has_question);
        return new ResponseEntity<Has_Question>(has_question, HttpStatus.OK);
       }
       catch(NoSuchElementException e){
        return new ResponseEntity<Has_Question>(HttpStatus.NOT_FOUND);
       }
    }
}