package applicationpackage.controllers.interfaces;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public interface IndexController {

    @GetMapping
    String indexMethod2(Model model);
}
