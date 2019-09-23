package com.smart.parking.service;

import com.smart.parking.domain.UserAccess;
import com.smart.parking.repository.IUserAccessRepository;
import com.smart.parking.security.configuration.UserDetailImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Weverton Souza.
 * Created on 01/07/19
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private IUserAccessRepository repository;

    @Autowired
    UserDetailsServiceImpl(final IUserAccessRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetailImpl loadUserByUsername(final String user) throws UsernameNotFoundException {
        Optional<UserAccess> optionalUser = this.repository.findByEmail(user);
        UserDetailImpl userDetail;

        if (!optionalUser.isPresent()) {
            throw new UsernameNotFoundException(user);
        }

        return new UserDetailImpl()
                .setId(optionalUser.get().getId())
                .setEmail(optionalUser.get().getEmail())
                .setPassword(optionalUser.get().getPassword());
    }
}
