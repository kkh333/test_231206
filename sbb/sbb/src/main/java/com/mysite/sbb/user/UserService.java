package com.mysite.sbb.user;

import com.mysite.sbb.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public void create(int count) {
        SiteUser siteUser = new SiteUser();
        siteUser.setCount(count);
        this.userRepository.save(siteUser);
    }

    public SiteUser suggestionUp() {
        Optional<SiteUser> siteUser = this.userRepository.findById(1L);
        if (siteUser.isPresent()) {
            siteUser.get().setCount(siteUser.get().getCount() + 1);
            return this.userRepository.save(siteUser.get());
        }
        else {
            throw new DataNotFoundException("user not found");
        }
    }

    public SiteUser getSiteUser() {
        Optional<SiteUser> siteUser = this.userRepository.findById(1L);
        if (siteUser.isPresent()) {
            return siteUser.get();
        }
        else {
            throw new DataNotFoundException("user not found");
        }
    }
}
