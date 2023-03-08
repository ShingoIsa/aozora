package com.example.aozora.service;

import com.example.aozora.entity.UserInform;

/** サービス処理の抽象メソッドだけ記述するとこ、(実行内容はServiceImpleでかく */
public interface AozoraService {
    /** ユーザ情報を登録する */
    void insert(UserInform ent);
}
