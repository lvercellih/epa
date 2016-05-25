package org.lvh.tsbp.auth.db.model;

import org.lvh.tsbp.core.db.model.SystemUser;

import javax.persistence.*;

/**
 * Created by lvercelli on 5/25/16.
 */
//@Entity
//@Table(name = "auth_user_token")
public class AuthUserToken {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "core_user_id")
    private SystemUser systemUser;

    @Column(name = "token")
    private String token;
}
