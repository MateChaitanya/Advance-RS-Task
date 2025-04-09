package cm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/view")
    public String showHomePage() {
        System.out.println("Accessed /view endpoint.");
        return "index";
    }

    @RequestMapping("/hello")
    public String showUserInfo(Model model) {
        model.addAttribute("name", "Seema");
        model.addAttribute("id", 101);
        return "index";
    }

    @RequestMapping("/details")
    public ModelAndView showDetails() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("name", "Ram");
        mv.addObject("id", 102);
        return mv;
    }

    @RequestMapping("/user")
    public String handleRequestParams(@RequestParam("id") int id,
                                      @RequestParam("name") String name,
                                      Model model) {
        model.addAttribute("name", name);
        model.addAttribute("id", id);
        return "index";
    }

    @RequestMapping("/profile/{id}/{name}")
    public String handlePathVariables(@PathVariable int id,
                                      @PathVariable String name,
                                      Model model) {
        model.addAttribute("userId", id);
        model.addAttribute("name", name);
        return "index";
    }

    @PostMapping("/submit")
    public String handleFormSubmit(@RequestParam("id") int id,
                                   @RequestParam("name") String name,
                                   Model model) {
        model.addAttribute("userId", id);
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/submit")
    public String handleGetRequest(@RequestParam("id") int id,
                                   @RequestParam("name") String name,
                                   @RequestParam("location") String location,
                                   Model model) {
        model.addAttribute("userId", id);
        model.addAttribute("name", name);
        model.addAttribute("location", location);
        return "index";
    }
}
