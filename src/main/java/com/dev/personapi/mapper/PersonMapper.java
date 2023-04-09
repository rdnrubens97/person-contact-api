package com.dev.personapi.mapper;

import com.dev.personapi.domain.PersonEntity;
import com.dev.personapi.request.PersonRequest;
import com.dev.personapi.response.PersonResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonEntity toEntity(PersonRequest personRequest);
    PersonResponse toResponse(PersonEntity personEntity);
}
