package Pedro.SAori.service.hampelot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstoquePecasDTO {

    private Long id;
    private Double custo;
    private String descricao;
    private int quantidade;

}
