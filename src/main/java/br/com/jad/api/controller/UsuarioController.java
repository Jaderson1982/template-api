package br.com.jad.api.controller;

import br.com.jad.api.model.UsuarioModel;
import br.com.jad.api.repository.UsuarioRepository;
import br.com.jad.api.request.UsuarioRequest;
import br.com.jad.api.response.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public UsuarioResponse saveUsuario(@Valid @RequestBody UsuarioRequest usuarioRequest){
        UsuarioModel usuarioModel = usuarioRepository.save(usuarioRequest.toModel());
        return new UsuarioResponse(usuarioModel);
    }

}
