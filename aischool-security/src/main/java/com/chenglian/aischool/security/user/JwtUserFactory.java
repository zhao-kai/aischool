package com.chenglian.aischool.security.user;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.chenglian.aischool.security.entity.User;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
    	List<String> roleNames = new ArrayList<>();
    	user.getRoles().forEach(role -> roleNames.add(role.getRoleName()));
        return new JwtUser(user.getUserId(), user.getUsername(),
                user.getPassword(), user.getEmail(),
                mapToGrantedAuthorities(roleNames), user.getLastPasswordResetDate());
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<String> authorities) {
        return authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }
}

