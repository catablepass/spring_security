package ru.diasoft.security_demo.domain;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

@Data
public class User implements UserDetails {
    private List<Role> authorities;
    private String password;
    private String username;
    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private boolean isEnabled;
}
