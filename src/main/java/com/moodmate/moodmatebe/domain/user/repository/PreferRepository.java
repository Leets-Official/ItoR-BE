package com.moodmate.moodmatebe.domain.user.repository;

import com.moodmate.moodmatebe.domain.user.domain.Prefer;
import com.moodmate.moodmatebe.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PreferRepository extends JpaRepository<Prefer, Long> {
    Optional<Prefer> findById(Long preferId);

    List<Prefer> findAll();

    Optional<Prefer> findByUser(User user);
}