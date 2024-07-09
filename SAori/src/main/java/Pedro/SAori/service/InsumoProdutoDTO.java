package Pedro.SAori.service;

import Pedro.SAori.entity.EstoqueInsumos;
import Pedro.SAori.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InsumoProdutoDTO {

    private Long id;
    private ProdutoDTO produto;
    private EstoqueInsumosDTO estoqueInsumos;
    private double quantidadeInsumo;
}
