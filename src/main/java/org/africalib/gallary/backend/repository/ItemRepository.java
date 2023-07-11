package org.africalib.gallary.backend.repository;

import java.util.List;

import org.africalib.gallary.backend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findByIdIn(List<Integer> ids);
}
