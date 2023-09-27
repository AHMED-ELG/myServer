package io.elg.server.model;

import io.elg.server.enumeration.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.AUTO;


@Entity
@Data // to get getters, setters and stuff
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "ipAdress can not be empty or null.")
    private String ipAdress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;


}
