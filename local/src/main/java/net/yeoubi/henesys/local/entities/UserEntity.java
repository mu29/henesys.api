package net.yeoubi.henesys.local.entities;

import net.yeoubi.henesys.domain.entities.User;

import javax.persistence.*;
import java.util.Collection;
import java.util.stream.Collectors;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String token;

    @Column
    private String email;

    @Column
    private String name;

    @OneToMany(cascade=CascadeType.ALL)
    private Collection<ArticleEntity> articles;

    public UserEntity(
        Integer id,
        String token,
        String email,
        String name
    ) {
        this.id = id;
        this.token = token;
        this.email = email;
        this.name = name;
    }

    public UserEntity(
        Integer id,
        String token,
        String email,
        String name,
        Collection<ArticleEntity> articles
    ) {
        this.id = id;
        this.token = token;
        this.email = email;
        this.name = name;
        this.articles = articles;
    }

    public static UserEntity toEntity(User user) {
        return new UserEntity(
            user.getId(),
            user.getToken(),
            user.getEmail(),
            user.getName(),
            user.getArticles().stream()
                .map(ArticleEntity::toEntity)
                .collect(Collectors.toList())
        );
    }

    public static User fromEntity(UserEntity user) {
        return new User(
            user.id,
            user.token,
            user.email,
            user.name,
            user.articles.stream()
                .map(ArticleEntity::fromEntity)
                .collect(Collectors.toList())
        );
    }
}
