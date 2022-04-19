package applicationpackage.services.interfaces;

import applicationpackage.data.Groceries;

import java.util.List;

public interface GroceriesService {

        List<Groceries> getAllGrocers();
        void addGroceries(Groceries groceries);
}
