package com.acme.featherbokk.platform.profiles.domain.services;

import com.acme.featherbokk.platform.profiles.domain.model.aggregates.Profile;
import com.acme.featherbokk.platform.profiles.domain.model.commands.CreateProfileCommand;

import java.util.Optional;

public interface ProfileCommandService {
    Optional<Profile> handle(CreateProfileCommand command);
}