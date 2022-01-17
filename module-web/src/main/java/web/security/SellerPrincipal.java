package web.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import web.seller.domain.Seller;

import java.util.Collection;
import java.util.Collections;

public class SellerPrincipal implements UserDetails {

    private final Seller seller;

    public SellerPrincipal(Seller seller) {
        this.seller = seller;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority(seller.getRole().name()));
    }

    @Override
    public String getPassword() {
        return seller.getPassword();
    }

    @Override
    public String getUsername() {
        return seller.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Seller getSeller() {
        return this.seller;
    }
}