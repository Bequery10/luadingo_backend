
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Badge;
import com.avengers.luadingo.service.BadgeService;

import java.util.*;

@RestController
@RequestMapping("/Badge")
@CrossOrigin
public class BadgeController{
    @Autowired
    private BadgeService badgeService;

    @PostMapping("/add")
    public String add(@RequestBody Badge badge){
        badgeService.save(badge);
        return "New Badge is added";
    }

    @GetMapping("/getAll")
    public List<Badge> getAllBadges(){
        return badgeService.getAll();
    }

    @GetMapping("/{badge_id}")
    public ResponseEntity<Badge> get(@PathVariable int badge_id){
       try{
        Badge badge = badgeService.get(badge_id);
        return new ResponseEntity<Badge>(badge, HttpStatus.OK);
       }
       catch(NoSuchElementException e){
        return new ResponseEntity<Badge>(HttpStatus.NOT_FOUND);
       }
    }

    @PutMapping("/{badge_id}")
    public ResponseEntity<Badge> update(@RequestBody Badge badge, @PathVariable int badge_id){
       try{
        Badge existingBadge = badgeService.get(badge_id);
        badgeService.delete(badge_id);
        badgeService.save(badge);
        return new ResponseEntity<Badge>(badge, HttpStatus.OK);
       }
       catch(NoSuchElementException e){
        return new ResponseEntity<Badge>(HttpStatus.NOT_FOUND);
       }
    }
}