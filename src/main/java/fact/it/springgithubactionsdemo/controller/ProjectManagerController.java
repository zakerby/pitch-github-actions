package zakerby.pitchgithubactions.controller;


import zakerby.pitchgithubactions.model.ProjectManager;

@Controller
public class ProjectManagerController {
    @GetMapping("/projectmanager")
    public String projectManager(Model model) {
        ProjectManager projectManager = new ProjectManager("Jane", "Doe", "Scrum Master");
        model.addAttribute("projectManager", projectManager);
        return "projectmanager";
    }
}