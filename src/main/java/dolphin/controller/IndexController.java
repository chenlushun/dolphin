package dolphin.controller;

import dolphin.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alex
 **/
@Controller
public class IndexController {

    @Autowired
    private SiteService siteService;

    @RequestMapping("/index")
    public String index(ModelMap model) {
        model.put("site", siteService.findAll());
        return "index";
    }
}
