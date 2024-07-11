package Pedro.SAori.service;

import Pedro.SAori.entity.Cnpj;
import Pedro.SAori.entity.Endereco;
import Pedro.SAori.repository.CnpjRepository;

public class CnpjService {

    private CnpjRepository repository;

    public void post(CnpjDTO cnpjDTO){
        Cnpj cnpj = new Cnpj();
        cnpj.setNome(cnpjDTO.getNome());
        cnpj.setTelefone(cnpjDTO.getTelefone());
        cnpj.setTipo(cnpjDTO.getTipo());
        cnpj.setObs(cnpjDTO.getObs());
        cnpj.setCnpj(cnpjDTO.getCnpj());
        cnpj.setNomeFantasia(cnpjDTO.getNomeFantasia());
        cnpj.setTipo(cnpjDTO.getTipo());
        cnpj.setIE(cnpjDTO.getIE());
        cnpj.setIM(cnpjDTO.getIM());
        cnpj.setRamoAtividade(cnpjDTO.getRamoAtividade());

        Endereco endereco = new Endereco();
        endereco.setLogradouro(cnpjDTO.getEndereco().getLogradouro());
        endereco.setBairro(cnpjDTO.getEndereco().getBairro());
        endereco.setNumero(cnpjDTO.getEndereco().getNumero());
        endereco.setCidade(cnpjDTO.getEndereco().getCidade());
        endereco.setEstado(cnpjDTO.getEndereco().getEstado());
        endereco.setComplemento(cnpjDTO.getEndereco().getComplemento());
        endereco.setCep(cnpjDTO.getEndereco().getCep());

        repository.save(cnpj);
    }
    public void save(Cnpj cnpj){
        repository.save(cnpj);
    }
}
