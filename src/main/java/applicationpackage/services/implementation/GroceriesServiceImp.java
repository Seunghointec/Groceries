package applicationpackage.services.implementation;

import applicationpackage.data.Groceries;
import applicationpackage.repositories.GroceriesRepository;
import applicationpackage.services.interfaces.GroceriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroceriesServiceImp implements GroceriesService {

    private GroceriesRepository groceriesRepository;

    public GroceriesServiceImp(){}

    @Autowired
    public GroceriesServiceImp(GroceriesRepository groceriesRepository) {
        this.groceriesRepository = groceriesRepository;
    }

  /*  @Override
    public List<Groceries> getAllGrocers() {
        return groceriesRepository.findAll();
    }
*/
  @Override
  public List<Groceries> getAllGrocers() {
      List<Groceries> groceries = new ArrayList<>();
      groceries.add(new Groceries(1,"apple", 5, 1.00));
      groceries.add(new Groceries(2,"milk", 3, 1.50));
      return groceries;
  }
    @Override
    public void addGroceries(Groceries groceries) {
        groceriesRepository.save(groceries);
    }
}
