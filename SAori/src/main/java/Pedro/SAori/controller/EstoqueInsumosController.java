package Pedro.SAori.controller;

import Pedro.SAori.service.EstoqueInsumosDTO;
import Pedro.SAori.entity.EstoqueInsumos;
import Pedro.SAori.service.EstoqueInsumosService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estoque/insumos")
@AllArgsConstructor
public class EstoqueInsumosController {

    private final EstoqueInsumosService estoqueInsumosService;

    @PostMapping("/adicionar")
    public ResponseEntity<String> adicionarInsumos(@RequestBody EstoqueInsumosDTO estoqueInsumosDTO) {
        estoqueInsumosService.adicionarInsumos(estoqueInsumosDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insumo adicionado com sucesso");
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> atualizarInsumos(@PathVariable Long id, @RequestBody EstoqueInsumosDTO estoqueInsumosDTO) {
        estoqueInsumosDTO.setId(id); // Define o ID no DTO para garantir que o ID seja passado corretamente
        estoqueInsumosService.updateEstoqueInsumos(estoqueInsumosDTO);
        return ResponseEntity.ok("Insumo atualizado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstoqueInsumos> buscarInsumoPorId(@PathVariable Long id) {
        EstoqueInsumos insumo = estoqueInsumosService.findById(id);
        return ResponseEntity.ok(insumo);
    }
}