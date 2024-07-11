package Pedro.SAori.controller;

import Pedro.SAori.entity.Cnpj;
import Pedro.SAori.service.CnpjService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cnpj")
public class CnpjController {

    private CnpjService cnpjService;

    public CnpjController() {

    }

    @PostMapping("/post")
    public String post(@ModelAttribute("cnpj")Cnpj cnpj) {

        cnpjService.save(cnpj);

        return "redirect:/cnpj/list";
    }
}
