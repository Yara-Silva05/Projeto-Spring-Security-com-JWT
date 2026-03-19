package models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "TB_POSTS")
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long postID;

    private UserModel user;

    private String content;

    @CreationTimestamp
    private Instant creationTimestamp;
}
