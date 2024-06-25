package org.finance.controller;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.finance.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.finance.utils.Database;

import java.sql.SQLException;

@RestController
@RequestMapping("/api/usuarios")
public class AccountController {

    private final HttpServletRequest httpServletRequest;

    public AccountController(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    @PostMapping("/adicionar")
    public void addUser(@RequestBody User user) throws SQLException, ClassNotFoundException {
        try {
            Database db = new Database();
            db.insertDatabase(user);
        } finally {
        }
    }
}
