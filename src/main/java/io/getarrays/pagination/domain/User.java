package io.getarrays.pagination.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author Get Arrays (https://www.getarrays.io/)
 * @version 1.0
 * @since 6/26/2022
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter @Setter
@JsonInclude(NON_DEFAULT)
public class User {
    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String status;
    private String address;
    private String phone;
    private String imageUrl;
}
