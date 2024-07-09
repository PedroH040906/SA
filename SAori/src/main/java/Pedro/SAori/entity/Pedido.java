package Pedro.SAori.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "data_pedida")
    private Date dataPedida;
    @Column(name = "data_entrega")
    private Date dataEntrega;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "status")
    private Status status;
}
