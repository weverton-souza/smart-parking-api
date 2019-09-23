package com.smart.parking.service;

import com.smart.parking.abstracts.AbstractService;
import com.smart.parking.domain.UserAccess;
import com.smart.parking.dto.CredentialsDTO;
import com.smart.parking.dto.UserAccessDTO;
import com.smart.parking.mapper.IUserAccessMapper;
import com.smart.parking.repository.IUserAccessRepository;
import com.smart.parking.security.property.JwtConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@Service
public class UserAccessServiceImpl extends AbstractService<UserAccessDTO, UUID> {
    private final IUserAccessRepository accessRepository;
    private final IUserAccessMapper accessMapper;
    private final JwtConfiguration jwtConfiguration;
    private final BCryptPasswordEncoder cryptPasswordEncoder = new BCryptPasswordEncoder();

    @Autowired
    public UserAccessServiceImpl(final IUserAccessRepository repository, final IUserAccessMapper mapper,
                                 final JwtConfiguration jwtConfiguration) {
        super(repository, mapper);
        this.accessRepository = repository;
        this.accessMapper = mapper;
        this.jwtConfiguration = jwtConfiguration;
    }

    @Override
    public UserAccessDTO saveOrUpdate(UserAccessDTO dto) {
        if(dto.getId() == null) {
            dto.setPassword(this.getSaltString());
            dto.setPassword(cryptPasswordEncoder.encode(dto.getPassword()));
        }
        return this.accessMapper.toDTO(this.accessRepository.save(this.accessMapper.toDomain(dto)));
    }

    public UserAccessDTO loadUserAccess(final CredentialsDTO credentials) {
        Optional<UserAccess> optUserAccess = this.accessRepository.findByEmail(credentials.getEmail());

        UserAccessDTO userAccess =
                this.accessMapper.toDTO(optUserAccess.orElseThrow(() -> new UsernameNotFoundException("")));
        return userAccess
                .setToken(successfulAuthentication(userAccess));
    }

    private String successfulAuthentication(final UserAccessDTO userAccess) {
        return this.jwtConfiguration.generateToken(userAccess.getEmail());
    }

    private String getSaltString() {
        String passChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder password = new StringBuilder();
        Random rnd = new Random();
        while (password.length() < 8) {
            int index = (int) (rnd.nextFloat() * passChars.length());
            password.append(passChars.charAt(index));
        }

        return password.toString();
    }
}
