package com.michellerodrigues.booksstoremanager.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AuthorDTO {
    @NotBlank
    @Size(max = 200)
    private long ind;

    @NotNull
    @Size(max = 100)
    private Integer age;


}
