package Pedro.SAori.controller;

import Pedro.SAori.service.geral.CnpjService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cnpj")
@AllArgsConstructor
public class CnpjController {

    CnpjService cnpjService;

}
