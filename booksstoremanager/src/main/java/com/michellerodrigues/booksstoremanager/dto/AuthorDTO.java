package com.michellerodrigues.booksstoremanager.dto;

import com.michellerodrigues.booksstoremanager.entity.Author;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AuthorDTO {

    private long id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotNull
    @Size(max = 100)
    private Integer age;


}
