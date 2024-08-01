package com.nut.CycleManagement.config;

import com.nut.CycleManagement.entities.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserInfo {

    private UserEntity userEntity;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
