package com.example.aozora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aozora.entity.UserInform;
import com.example.aozora.repository.AozoraRepository;

/** AozoraServiceImplインターフェースの処理内容を記載 */
@Service
public class AozoraServiceImpl  implements AozoraService {
    
    @Autowired
    AozoraRepository repository;
    
    @Override
    public void insert(UserInform ent) {
        repository.save(ent);
    };
}
