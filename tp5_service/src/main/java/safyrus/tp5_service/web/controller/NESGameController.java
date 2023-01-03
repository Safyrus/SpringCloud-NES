package safyrus.tp5_service.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import safyrus.tp5_service.dao.NESGameRepo;
import safyrus.tp5_service.model.NESGame;

@RestController
public class NESGameController {

    @Value("${me}")
    private String me;

    @Autowired
    private NESGameRepo dao;

    @GetMapping(value = "/NESGames")
    public List<NESGame> getAll() {
        return dao.findAll();
    }

    @GetMapping(value = "/NESGames/{id}")
    public NESGame getById(@PathVariable String id) {
        return dao.findByID(id);
    }

    @PostMapping(value = "/NESGames", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void add(@RequestBody NESGame game) {
        dao.save(game);
    }

    @DeleteMapping(value = "/NESGames/{id}")
    @Transactional
    public void remove(@PathVariable String id) {
        dao.deleteByID(id);
    }

    @GetMapping(value = "/who")
    public String getMe() {
        return me;
    }
}
