package com.example.aozora.repository;

import com.example.aozora.entity.UserInform;
import org.springframework.data.repository.CrudRepository;


/** UserInform_eテーブル専用：RepositoryImpl(インフラストラクチャ層) */
public interface AozoraRepository extends CrudRepository<UserInform, Integer>{

}
