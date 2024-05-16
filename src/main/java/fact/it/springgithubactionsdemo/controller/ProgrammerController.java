package zakerby.pitchgithubactions.controller;

import zakerby.pitchgithubactions.model.Programmer;

@Controller
public class ProgrammerController {

    @GetMapping("/programmer")
    public String programmer(Model model) {
        Programmer programmer = new Programmer("John", "Doe", "Java");
        model.addAttribute("programmer", programmer);
        return "programmer";
    }
}
