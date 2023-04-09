package com.dev.personapi.mapper;

import com.dev.personapi.domain.ContactEntity;
import com.dev.personapi.request.ContactRequest;
import com.dev.personapi.response.ContactResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    ContactEntity toEntity(ContactRequest contactRequest);
    ContactResponse toResponse(ContactEntity contactEntity);
    List<ContactEntity> toEntityList(List<ContactRequest> contactRequestList);
    List<ContactResponse> toResponseList(List<ContactEntity> contactEntityList);

}
