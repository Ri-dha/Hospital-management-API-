package com.azu.hospital.all_user_sevices.employee.permanent.services;

import com.azu.hospital.all_user_sevices.user_utils.lookup.AppUser;
import com.azu.hospital.all_user_sevices.user_utils.lookup.UserLookupStrategy;
import com.azu.hospital.all_user_sevices.employee.permanent.dao.PermanentDao;
import com.azu.hospital.exceptions.ResourceNotFoundException;
import com.azu.hospital.transulator.ExceptionsMessageReturn;
import com.azu.hospital.transulator.UTF8Control;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

@Service("PermanentAppUser")
public class PermanentUserLookupStrategy implements UserLookupStrategy {
    private final ExceptionsMessageReturn messageReturn;

    private final PermanentDao dao;

    public PermanentUserLookupStrategy(ExceptionsMessageReturn messageReturn, @Qualifier("PermanentJpa") PermanentDao dao) {
        this.messageReturn = messageReturn;
        this.dao = dao;
    }

    @Override
    public Optional<AppUser> findUserByEmail(String email) {
        Locale locale = messageReturn.getMessageLocally();
        ResourceBundle messages = ResourceBundle.getBundle("messages", locale, new UTF8Control());
        return Optional.ofNullable(
                dao.findByEmail(email)
                        .orElseThrow(
                                () -> new ResourceNotFoundException(
                                        messages.getString("resourceNotFound")
                                )
                        )
        );
    }

    @Override
    public boolean existsUserByEmail(String email) {
        return dao.existsByEmail(email);
    }
}