package Pedro.SAori.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pedido")
public class ItenDoPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToOne
    private Produto produto;
    @OneToOne
    private Pedido pedido;
    @Column(name = "valor_unitario")
    private double valorUnitario;
    @Column(name = "valor_total")
    private double valorTotal;
    @Column(name = "quantidade_pedida")
    private int qtdPedida;
}
