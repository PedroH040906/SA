package Pedro.SAori.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {

    private Long id;
    private Date dataPedida;
    private Date dataEntrega;
    private String descricao;
    private Status status;

    private PedidoDTO(Date dataPedida, Date dataEntrega, String descricao, Status status) {
        this.dataPedida = dataPedida;
        this.dataEntrega = dataEntrega;
        this.descricao = descricao;
        this.status = status;
    }
}
