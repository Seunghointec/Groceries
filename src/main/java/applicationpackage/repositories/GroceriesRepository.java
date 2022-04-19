package applicationpackage.repositories;

import applicationpackage.data.Groceries;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GroceriesRepository extends JpaRepository<Groceries, Integer> {
    List<Groceries> findByName(String name);
}

