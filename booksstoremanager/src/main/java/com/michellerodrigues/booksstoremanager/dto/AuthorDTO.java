package com.michellerodrigues.booksstoremanager.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthorDTO {
    @NotBlank
    @Size(max = 200)
    private long ind;

    @NotNull
    @Size(max = 100)
    private Integer age;


}
