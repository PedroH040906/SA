package Pedro.SAori.service;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CnpjDTO extends PessoaDTO {
    private PessoaDTO pessoa;
    private String cnpj;
    private String nomeFantasia;
    private String tipo;
    private String iM;
    private String iE;
    private String ramoAtividade;
}
