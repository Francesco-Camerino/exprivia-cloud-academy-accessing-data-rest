package cloud.academy.exprivia.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Questa interfaccia rappresenta un repository per la gestione delle operazioni CRUD sugli oggetti di tipo Persona.
 * Estende le interfacce `PagingAndSortingRepository` e `CrudRepository` per fornire funzionalità di paginazione,
 * ordinamento e operazioni CRUD.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>, CrudRepository<Person, Long> {

    /**
     * Trova una lista di persone in base al loro cognome.
     *
     * @param name Il cognome da cercare.
     * @return Una lista di persone con il cognome specificato.
     */
    List<Person> findByLastName(@Param("name") String name);

}
