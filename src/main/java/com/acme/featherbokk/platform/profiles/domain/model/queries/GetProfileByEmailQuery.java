package com.acme.featherbokk.platform.profiles.domain.model.queries;

import com.acme.featherbokk.platform.profiles.domain.model.valueobjects.EmailAddress;

public record GetProfileByEmailQuery(EmailAddress emailAddress) {
}