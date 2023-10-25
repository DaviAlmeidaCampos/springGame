package com.senai.davi.ProjGame.services;

import java.util.List;
import com.senai.davi.ProjGame.etities.Jogo;
import com.senai.davi.ProjGame.repositories.JogoRepository;
public class JogoServices {

	private final JogoRepository jogoRepository;

	public JogoServices(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}

	// inserir Jogo
	public Jogo getJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}
	
	//inserir produto
	public Jogo saveJogo(Jogo jogo) {
    return jogoRepository.save(jogo);
	}

	// listar produto por id
	public Jogo setJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}

	// listar todos os produtos
	public List<Jogo> getAllJogo() {
		return jogoRepository.findAll();
	}

	// apagar produto
	public void deleteJogo(Long id) {
		jogoRepository.deleteById(id);
	}
}
