package com.gestionImmobiliere.creditBail.controller;

import com.gestionImmobiliere.creditBail.domain.Achat;
import com.gestionImmobiliere.creditBail.service.AchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/rest", name = "app_achats_")
public class AchatController {
    private final AchatService achatService;

    @Autowired
    public AchatController(AchatService achatService) {
        this.achatService = achatService;
    }

    @GetMapping(path = "/achats", name = "list")
    @ResponseStatus(HttpStatus.OK)
    public List<Achat> list() {
        return this.achatService.getAllAchats();
    }

    @GetMapping(path = "/achats/{id}", name = "read")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Achat> read(@PathVariable Long id) {
        return this.achatService.getOneAchat(id);
    }

    @PostMapping(path = "/achats", name = "create")
    @ResponseStatus(HttpStatus.CREATED)
    public Achat add(@RequestBody Achat achat) {
        return this.achatService.saveAchat(achat);
    }

    @PutMapping(path = "/achats/{id}", name = "update")
    @ResponseStatus(HttpStatus.OK)
    public Achat update(@RequestBody Achat achat, @PathVariable Long id) {
        return this.achatService.updateAchat(achat, id);
    }

    @DeleteMapping(path = "/achats/{id}", name = "remove")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Long id) {
        this.achatService.removeAchat(id);
    }
}
