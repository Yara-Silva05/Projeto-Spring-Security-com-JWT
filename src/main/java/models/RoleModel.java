package models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ROLES")
public class RoleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleID;

    private String name;
}
