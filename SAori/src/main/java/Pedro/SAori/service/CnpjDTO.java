package Pedro.SAori.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CnpjDTO {

    private PessoaDTO pessoa;
    private String cnpj;
    private String nomeFantasia;
    private String tipo;
    private String iM;
    private String iE;
    private String ramoAtividade;

    private CnpjDTO(String cnpj,String nomeFantasia,String tipo,String iM,String iE,String ramoAtividade) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.tipo = tipo;
        this.iM = iM;
        this.iE = iE;
        this.ramoAtividade = ramoAtividade;
    }
}
