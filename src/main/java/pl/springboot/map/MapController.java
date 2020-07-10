package pl.springboot.map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    @GetMapping
    public String getMap(Model model){
        model.addAttribute("point", new Point(52.100, 21.53,"Kołbiel"));
        return "map";
    }
}
