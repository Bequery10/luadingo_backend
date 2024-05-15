import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Attempts;
import com.avengers.luadingo.model.AttemptsPK;
import com.avengers.luadingo.service.AttemptsService;

import java.util.*;

@RestController
@RequestMapping("/Attempts")
@CrossOrigin
public class AttemptsController{
    @Autowired
    private AttemptsService attemptsService;

    @PostMapping("/add")
    public String add(@RequestBody Attempts attempts){
        attemptsService.save(attempts);
        return "New Attempts is added";
    }

    @GetMapping("/getAll")
    public List<Attempts> getAllAttempts(){
        return attemptsService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Attempts> get(@PathVariable AttemptsPK id){
       try{
        Attempts attempts = attemptsService.get(id);
        return new ResponseEntity<Attempts>(attempts, HttpStatus.OK);
       }
       catch(NoSuchElementException e){
        return new ResponseEntity<Attempts>(HttpStatus.NOT_FOUND);
       }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Attempts> update(@RequestBody Attempts attempts, @PathVariable AttemptsPK id){
       try{
        Attempts existingAttempts = attemptsService.get(id);
        attemptsService.delete(id);
        attemptsService.save(attempts);
        return new ResponseEntity<Attempts>(attempts, HttpStatus.OK);
       }
       catch(NoSuchElementException e){
        return new ResponseEntity<Attempts>(HttpStatus.NOT_FOUND);
       }
    }
}