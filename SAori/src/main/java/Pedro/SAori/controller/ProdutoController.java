package Pedro.SAori.controller;

import Pedro.SAori.service.meu.ProdutoDTO;
import Pedro.SAori.service.meu.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
@AllArgsConstructor
public class ProdutoController {

    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<String> criarProduto(@RequestBody ProdutoDTO produtoDTO) {
        produtoService.criarProduto(produtoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("produto criado com sucesso");
    }

}
