package Pedro.SAori.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {

    private Long id;
    private String logradouro;
    private String bairro;
    private String numero;
    private String cidade;
    private String estado;
    private String complemento;
    private String cep;

    public EnderecoDTO(String logradouro,String bairro,String numero,String cidade,String estado,String complemento,String cep) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
        this.cep = cep;
    }
}
