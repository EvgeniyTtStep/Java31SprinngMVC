package org.itstep.dao;

import org.itstep.model.Developer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Repository
public class DeveloperDAO implements BaseEntity<Developer, Integer> {


    List<Developer> developers = new ArrayList<>(
            List.of(
                    new Developer(1, "Bob", "111"),
                    new Developer(2, "Tom", "222"),
                    new Developer(3, "Karl", "333"),
                    new Developer(4, "Kevin", "444")
            )
    );


    @Override
    public void save(Developer developer) {
        developers.add(developer);
    }

    @Override
    public void update(Developer developer) {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public List<Developer> getAll() {
        return developers;
    }

    @Override
    public Developer getById(Integer integer) {
        return null;
    }

    public Developer getByPhone(String phone) {
        for (Developer developer : developers) {
            if (developer.getPhone().equals(phone)) {
                return developer;
            }
        }
        return null;
    }
}
