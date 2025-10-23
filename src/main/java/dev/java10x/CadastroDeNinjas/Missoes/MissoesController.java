package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // GET -- MANDAR REQUISIÇÃO PARA MOSTRAR MISSOES
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missões listadas com sucesso";
    }

    //POST -- MANDAR UMA REQUISIÇÃO PARA CRIAR AS MISSOES
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão criada com sucesso";
    }

    //PUT -- REQUISIÇÃO PARA ALTERAR AS MISSOES
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso.";
    }

    //DELETE -- MADAR UMA REQUISIÇÃO PARA DELETAR AS MISSOES
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missão deletada com sucesso";
    }

}
