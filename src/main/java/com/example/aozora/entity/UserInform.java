package com.example.aozora.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="userinform")
public class UserInform {

    /** 識別ID */
    @Id
    private Integer id;
    /** 名前の「姓」 */
    private String sei;
    /** 名前の「名」 */
    private String mei;
    /** ユーザのメールアドレス */
    private String email;
    

    
}
