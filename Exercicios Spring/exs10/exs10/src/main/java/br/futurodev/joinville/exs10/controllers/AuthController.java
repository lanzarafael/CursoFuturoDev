package br.futurodev.joinville.exs10.controllers;

import br.futurodev.joinville.exs10.dtos.AuthDTO;
import br.futurodev.joinville.exs10.entity.Usuario;
import br.futurodev.joinville.exs10.service.TokenService;
import br.futurodev.joinville.exs10.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public String auth(@RequestBody AuthDTO authDTO) {
        UsernamePasswordAuthenticationToken usernamePassword =
                new UsernamePasswordAuthenticationToken(authDTO.username(), authDTO.senha());

        Authentication auth = authenticationManager.authenticate(usernamePassword);

        var usuario = (Usuario) auth.getPrincipal();

        return tokenService.generateToken(usuario);
    }
}