package applicationpackage.services.implementation;

import applicationpackage.data.Groceries;
import applicationpackage.repositories.GroceriesRepository;
import applicationpackage.services.interfaces.GroceriesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GroceriesServiceImp implements GroceriesService {

    private GroceriesRepository groceriesRepository;

    @Autowired
    public GroceriesServiceImp(GroceriesRepository groceriesRepository) {
        this.groceriesRepository = groceriesRepository;
    }

    @Override
    public List<Groceries> getAllGrocers() {
        return groceriesRepository.findAll();
    }

    @Override
    public void addGroceries(Groceries groceries) {
        groceriesRepository.save(groceries);
    }
}
