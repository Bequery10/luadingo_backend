package com.avengers.luadingo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.avengers.luadingo.service.SqlCommandService;
import java.util.Map;

@RestController
@RequestMapping("/run-sql-command")
@CrossOrigin
public class SqlCommandController {

    @Autowired
    private SqlCommandService sqlCommandService;

    @PostMapping
    public Map<String, Object> runSqlCommand(@RequestBody Map<String, String> sqlCommand) {
        return sqlCommandService.executeSqlCommand(sqlCommand.get("sql"));
    }
}
