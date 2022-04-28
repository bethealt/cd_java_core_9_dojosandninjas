package com.bethealt.dojosandninjas.repositories;
import com.bethealt.dojosandninjas.models.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface DojoRepository extends CrudRepository<Dojo, Long> {

    List<Dojo> findAll();
    
}
