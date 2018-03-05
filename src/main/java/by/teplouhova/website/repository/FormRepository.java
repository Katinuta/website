package by.teplouhova.website.repository;

import by.teplouhova.website.model.Form;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.stream.Stream;

public interface FormRepository extends CrudRepository<Form, Long> {
    @Query("select f from Form f where f.name = :name")
    Stream<Form> findByNameReturnStream(@Param("name") String name);
}
