package ar.edu.davinci.dvds20211cg8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds20211cg8.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
