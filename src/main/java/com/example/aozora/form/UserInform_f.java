package com.example.aozora.form;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInform_f {
    
    private Integer id;

    @NotBlank(message = "入力必須項目です")
    private String sei;

    @NotBlank(message = "入力必須項目です")
    private String mei;
    
    @NotBlank(message = "入力必須項目です")
    private String email;
    
}
