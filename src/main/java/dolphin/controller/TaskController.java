package dolphin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alex
 **/
@Controller
@RequestMapping("task")
public class TaskController {

    @RequestMapping
    public String index(ModelMap model) {
        return "task/task";
    }
}
