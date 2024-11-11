package com.example.postingapp.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.postingapp.entity.User;

public class UserDetailsImpl implements UserDetails{
	
	private final User user;
	private final Collection<GrantedAuthority> authorities;
	
	public UserDetailsImpl(User user,Collection<GrantedAuthority> authorities){
		this.user = user;
		this.authorities = authorities;
	}
	
	public User getUser() {
		return user;
	}
	
	@Override
	public String getPassword() {
		return user.getPassword();
	}
	
	@Override
	public String getUsername() {
		return user.getEmail();
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities(){
		return authorities;
	}
	
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    //本アプリではアカウントやパスワードの期限、アカウントのロックといった機能は作成しません。よって、それらのメソッドは必ずtrueを返すようにしています。
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	//本アプリではアカウントやパスワードの期限、アカウントのロックといった機能は作成しません。よって、それらのメソッドは必ずtrueを返すようにしています。
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	//本アプリではアカウントやパスワードの期限、アカウントのロックといった機能は作成しません。よって、それらのメソッドは必ずtrueを返すようにしています。
	
	@Override
	public boolean isEnabled() {
		return user.getEnabled();
	}
	
}
