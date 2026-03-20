package yara.projeto_springSecurity_JWT.repository;

import yara.projeto_springSecurity_JWT.models.PostModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<PostModel, Long> {
}
