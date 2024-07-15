package Pedro.SAori.controller;

import Pedro.SAori.entity.Cnpj;
import Pedro.SAori.service.CnpjService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cnpj")
@AllArgsConstructor
public class CnpjController {

    CnpjService cnpjService;


    @PostMapping("/post")
    public String post(@ModelAttribute("cnpj")Cnpj cnpj) {

        cnpjService.save(cnpj);

        return "redirect:/cnpj/list";
    }
}
