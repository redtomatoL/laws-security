package com.ikaiyong.lawssecurity.User;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;



//https://www.jianshu.com/p/0713d4aae77f
@Component
@Slf4j
public class MyUserDetailService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        log.info("登陆用户名"+s);

        return new User(s,"123456",AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
