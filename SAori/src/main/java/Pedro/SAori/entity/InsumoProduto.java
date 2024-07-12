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
@Table(name = "insumo_produto")
public class InsumoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
//    @Column(name = "produto_id")
//    private Produto produto;
//    @Column(name = "estoque_insumo_id")
//    private EstoqueInsumos estoqueInsumos;
    @Column(name = "quantidade_insumo")
    private double quantidadeInsumo;
}
