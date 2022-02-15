package com.digit.goodsaccounting.security.details;

import com.digit.goodsaccounting.model.Account;
import com.digit.goodsaccounting.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("accountUserDetailsService")
public class AccountUserDetailsService implements UserDetailsService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        return new AccountUserDetails(
                accountRepository.findAccountByLogin(login).orElseThrow(
                        () -> new UsernameNotFoundException("User not found")));
    }
}
