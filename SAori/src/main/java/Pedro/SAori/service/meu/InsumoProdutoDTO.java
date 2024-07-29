package Pedro.SAori.service.meu;

import Pedro.SAori.service.luis.EstoqueInsumosDTO;
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
