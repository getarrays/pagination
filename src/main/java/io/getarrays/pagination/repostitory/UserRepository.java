package io.getarrays.pagination.repostitory;

import io.getarrays.pagination.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Get Arrays (https://www.getarrays.io/)
 * @version 1.0
 * @since 6/26/2022
 */

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    Page<User> findByNameContaining(String name, Pageable pageable);
}
