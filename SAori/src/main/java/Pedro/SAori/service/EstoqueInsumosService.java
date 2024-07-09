package Pedro.SAori.service;

import Pedro.SAori.entity.EstoqueInsumos;
import Pedro.SAori.repository.EstoqueInsumosRepository;

import java.util.Optional;

public class EstoqueInsumosService {

    private EstoqueInsumosRepository repository;

    public void adicionarInsumos(EstoqueInsumosDTO estoqueInsumosDTO){
        EstoqueInsumos estoqueInsumos = new EstoqueInsumos();
        estoqueInsumos.setNome(estoqueInsumosDTO.getNome());
        estoqueInsumos.setCor(estoqueInsumosDTO.getCor());
        estoqueInsumos.setPreco(estoqueInsumosDTO.getPreco());
        estoqueInsumos.setUM(estoqueInsumosDTO.getUM());
        estoqueInsumos.setQuantidade(estoqueInsumosDTO.getQuantidade());
        estoqueInsumos.setTipo(estoqueInsumosDTO.getTipo());

        //salvar insumo no banco
        repository.save(estoqueInsumos);
    }

    public void updateEstoqueInsumos(EstoqueInsumosDTO estoqueInsumosDTO){
        EstoqueInsumos estoqueInsumos = repository.findById(estoqueInsumosDTO.getId()).orElseThrow(() -> new RuntimeException("Insumo não encontrado"));
        estoqueInsumos.setNome(estoqueInsumosDTO.getNome());
        estoqueInsumos.setCor(estoqueInsumosDTO.getCor());
        estoqueInsumos.setPreco(estoqueInsumosDTO.getPreco());
        estoqueInsumos.setUM(estoqueInsumosDTO.getUM());
        estoqueInsumos.setQuantidade(estoqueInsumosDTO.getQuantidade());
        estoqueInsumos.setTipo(estoqueInsumosDTO.getTipo());

        //atualizar insumo no banco
        repository.save(estoqueInsumos);
    }

    public EstoqueInsumos findById(Long id) {
        Optional<EstoqueInsumos> result = repository.findById(id);

        EstoqueInsumos estoqueInsumos = null;

        if (result.isPresent()) {
            estoqueInsumos = result.get();
        }
        else{
            throw new RuntimeException("Insumo não encontrado");
        }

        return estoqueInsumos;
    }
    public EstoqueInsumos findbyName(String name) {
        Optional<EstoqueInsumos> result = repository.findByName(name);

        EstoqueInsumos estoqueInsumos = null;

        if (result.isPresent()) {
            estoqueInsumos = result.get();
        }
        else{
            throw new RuntimeException("Insumo não encontrado");
        }

        return estoqueInsumos;
    }
}