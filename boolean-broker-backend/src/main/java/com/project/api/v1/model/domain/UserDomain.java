package com.project.api.v1.model.domain;

import com.project.api.v1.model.entity.BankDetailsEntity;
import com.project.api.v1.model.entity.NomineeDetailsEntity;
import com.project.api.v1.model.entity.UserEntity;
import com.project.api.v1.model.entity.UserType;

import java.util.List;

public class UserDomain {
    private UserEntity user;
    private List<BankDetailsEntity> bankDetails;
    private List<NomineeDetailsEntity> nominees;

    public UserType getUserType() {
        return user.getUserType();
    }
}
