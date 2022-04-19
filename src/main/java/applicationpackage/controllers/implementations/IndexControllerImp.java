package applicationpackage.controllers.implementations;

import applicationpackage.controllers.interfaces.IndexController;
import applicationpackage.data.Groceries;
import applicationpackage.services.implementation.GroceriesServiceImp;
import applicationpackage.services.interfaces.GroceriesService;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexControllerImp implements IndexController {

    @Autowired
    private GroceriesService groceriesService;

    @Override
    @GetMapping("/create")
    public String indexMethod2(Model model) {

        model.addAttribute("groceries", groceriesService.getAllGrocers());
        return "index";
    }


}
