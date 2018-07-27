package com.example.demo.controller;

import com.example.demo.model.Lego;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class LegoController {

    @RequestMapping(value = "lego", method = RequestMethod.GET)
    public List<Lego> list() {
        return LegoStub.list();
    }

    @RequestMapping(value = "lego", method = RequestMethod.POST)
    public Lego create(@RequestBody Lego lego) {
        return LegoStub.create(lego);
    }

    @RequestMapping(value = "lego/{id}", method = RequestMethod.GET)
    public Lego get(@PathVariable Long id) {
        return LegoStub.get(id);
    }

    @RequestMapping(value = "lego/{id}", method = RequestMethod.PUT)
    public Lego update(@PathVariable Long id, @RequestBody Lego lego) {
        return LegoStub.update(id, lego);
    }

    @RequestMapping(value = "lego/{id}", method = RequestMethod.DELETE)
    public Lego delete(@PathVariable Long id) {
        return LegoStub.delete(id);
    }

}
