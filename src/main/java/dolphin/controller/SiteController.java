package dolphin.controller;

import dolphin.entity.Site;
import dolphin.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Alex
 **/
@Controller
@RequestMapping("/site")
public class SiteController {
    @Autowired
    private SiteService siteService;

    @RequestMapping
    public String save() {
        return "site/save";
    }

    @RequestMapping("submit")
    public String doSave(@RequestParam("name") String name,
                         @RequestParam("url") String url) {
        Site site = new Site();
        site.setName(name);
        site.setUrl(url);
        siteService.save(site);
        return "redirect:/index";
    }

    @RequestMapping(value = "/{id}", method = {RequestMethod.DELETE})
    public String doDel(@PathVariable("id") Long id) {
        siteService.delete(id);
        return "redirect:/index";
    }


}
