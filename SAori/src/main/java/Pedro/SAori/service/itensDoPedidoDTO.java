package Pedro.SAori.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class itensDoPedidoDTO {

    private Long id;
    private ProdutoDTO produto;
    private PedidoDTO pedido;
    private double valorUnitario;
    private double valorTotal;
    private int qtdPedida;
}
