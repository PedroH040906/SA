package Pedro.SAori.controller;

import Pedro.SAori.entity.Inventario;
import Pedro.SAori.service.frank.InventarioDTO;
import Pedro.SAori.service.frank.InventarioService;
import Pedro.SAori.service.frank.LocalITem;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventario")
@AllArgsConstructor
public class InventarioController {

    private InventarioService service;

    @PostMapping
    public ResponseEntity<String> adicionarIntens(@RequestBody InventarioDTO inventarioDTO) {
        service.adicionarItens(inventarioDTO);
        return ResponseEntity.status(201).body("Item adicionado com sucesso");
    }

    @GetMapping
    public ResponseEntity<Iterable<Inventario>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @DeleteMapping
    public ResponseEntity<String> excluirItem(@PathVariable Long id) {
        service.excluirItem(id);
        return ResponseEntity.status(200).body("Item excluído com sucesso");
    }

    @PatchMapping
    public ResponseEntity<String> alterarItemDeLugar(@PathVariable Long id, @RequestBody LocalITem novoLocal) {
        service.alterarItemdeLugar(id, novoLocal);
        return ResponseEntity.status(200).body("Item alterado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inventario> buscarItemPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarItemPorId(id));
    }
}