package dolphin.controller;

import dolphin.entity.Script;
import dolphin.service.ScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Alex
 **/
@Controller
@RequestMapping("script")
public class ScriptController {

    private final ScriptService scriptService;

    @Autowired
    public ScriptController(ScriptService scriptService) {
        this.scriptService = scriptService;
    }

    @RequestMapping
    public String index(ModelMap model) {
        model.put("script", scriptService.findAll());
        return "script/script";
    }

    @RequestMapping("/{id}")
    public String index(@PathVariable("id") Long id, ModelMap model) {
        model.put("script", scriptService.findById(id));
        return "script/view";
    }


    @RequestMapping("/sh/{name}")
    @ResponseBody
    public Object get(@PathVariable("name") String name) {
        Script script = scriptService.findByName(name);
        return script;
    }


    @RequestMapping("save")
    public String save() {
        return "script/save";
    }

    @RequestMapping("submit")
    public String submit(@RequestParam("name") String name,
                         @RequestParam("file") String file,
                         @RequestParam("type") Integer type,
                         @RequestParam("description") String description) {
        Script script = new Script();
        script.setName(name);
        script.setFile(file);
        script.setDescription(description);
        script.setParentId(0L);
        script.setType(type);
        scriptService.save(script);
        return "redirect:/script";
    }

    @RequestMapping("update")
    public String update(@RequestParam("id") Long id,
                         @RequestParam("name") String name,
                         @RequestParam("file") String file,
                         @RequestParam("type") Integer type,
                         @RequestParam("description") String description) {
        Script script0 = scriptService.findById(id);
        Script script = new Script();
        script.setId(id);
        script.setName(name);
        script.setFile(file);
        script.setParentId(script0.getId());
        script.setType(type);
        script.setDescription(description);
        scriptService.update(script);
        return "redirect:/script";
    }

    /**
     * 查看历史版本
     */
    @RequestMapping("history")
    public String history(@RequestParam("id") Long id,
                          @RequestParam("name") String name,
                          @RequestParam("file") String file,
                          @RequestParam("type") Integer type,
                          @RequestParam("description") String description) {
        return "redirect:/script";
    }

}
