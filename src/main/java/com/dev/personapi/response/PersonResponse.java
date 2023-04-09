package com.dev.personapi.response;

import lombok.Data;

import java.util.List;

@Data
public class PersonResponse {
    private String name;
    private String cpf;
    private String birthDate;
    private List<ContactResponse> contactResponseList;
}
