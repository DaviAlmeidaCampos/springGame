package com.senai.davi.ProjGame.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.senai.davi.ProjGame.etities.Jogo;
import com.senai.davi.ProjGame.services.JogoServices;

@RestController
public class JogoController {
	
	private final JogoServices jogoService;
	   
	public JogoController (JogoServices jogoService) {
	    this.jogoService = jogoService;
	}
	   
	@PostMapping
	public Jogo creatProduct (@RequestBody Jogo jogo) {
	    return jogoService.saveJogo(jogo);
	}
	   
	@GetMapping
	public List<Jogo> getAllJogo() {
	    return jogoService.getAllJogo();
	}
	   
	@GetMapping("/{id}")
	public ResponseEntity <Jogo> getJogo(@PathVariable Long id){
	    Jogo jogo = jogoService.getJogoById(id);
	    if (jogo !=null) {
	        return ResponseEntity.ok(jogo);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	   
	@DeleteMapping("/{id}")
	public void deleteJogo(@PathVariable Long id) {
	    jogoService.deleteJogo(id);
	}
}

	