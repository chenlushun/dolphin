package dolphin.controller;

import dolphin.entity.App;
import dolphin.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Alex
 **/
@Controller
@RequestMapping("/app")
public class AppController {
    @Autowired
    private AppService appService;

    @RequestMapping
    public String index(ModelMap model) {
        model.put("app", appService.findAll());
        return "app/app";
    }

    @RequestMapping("{project_name}")
    public String get(@PathVariable("project_name") String projectName, ModelMap model) {
        model.put("app", appService.findByName(projectName));
        return "app/view";
    }

    @RequestMapping("/save")
    public String save() {
        return "app/save";
    }

    @RequestMapping("/submit")
    public String submit(@RequestParam("projectName") String projectName,
                         @RequestParam("projectEnv") String projectEnv,
                         @RequestParam("projectAppPort") String projectAppPort,
                         @RequestParam("projectManagementPort") String projectManagementPort,
                         @RequestParam("projectLogsPath") String projectLogsPath,
                         @RequestParam("projectDeployHost") String projectDeployHost,
                         @RequestParam("projectDeployPath") String projectDeployPath,
                         @RequestParam("projectStartCmd") String projectStartCmd,
                         @RequestParam("sourceJarPath") String sourceJarPath,
                         @RequestParam("sourceJarName") String sourceJarName,
                         @RequestParam("startSeq") Integer startSeq) {
        appService.save(App.builder()
                .projectName(projectName)
                .projectAppPort(projectAppPort)
                .projectDeployHost(projectDeployHost)
                .projectEnv(projectEnv)
                .sourceJarName(sourceJarName)
                .projectLogsPath(projectLogsPath)
                .projectManagementPort(projectManagementPort)
                .projectStartCmd(projectStartCmd)
                .projectDeployPath(projectDeployPath)
                .startSeq(startSeq)
                .sourceJarPath(sourceJarPath)
                .build());
        return "redirect:/app";
    }

    @RequestMapping("update")
    public String update(@RequestParam("projectName") String projectName,
                         @RequestParam("projectEnv") String projectEnv,
                         @RequestParam("projectAppPort") String projectAppPort,
                         @RequestParam("projectManagementPort") String projectManagementPort,
                         @RequestParam("projectLogsPath") String projectLogsPath,
                         @RequestParam("projectDeployHost") String projectDeployHost,
                         @RequestParam("projectDeployPath") String projectDeployPath,
                         @RequestParam("projectStartCmd") String projectStartCmd,
                         @RequestParam("sourceJarPath") String sourceJarPath,
                         @RequestParam("sourceJarName") String sourceJarName,
                         @RequestParam("startSeq") Integer startSeq) {
        appService.update(App.builder()
                .projectName(projectName)
                .projectAppPort(projectAppPort)
                .projectDeployHost(projectDeployHost)
                .projectEnv(projectEnv)
                .sourceJarName(sourceJarName)
                .projectLogsPath(projectLogsPath)
                .projectManagementPort(projectManagementPort)
                .projectStartCmd(projectStartCmd)
                .projectDeployPath(projectDeployPath)
                .startSeq(startSeq)
                .sourceJarPath(sourceJarPath)
                .build());
        return "redirect:/app";
    }

}
