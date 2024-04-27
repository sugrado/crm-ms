package com.turkcell.crm.customer_service.business.rules;

import com.turkcell.crm.customer_service.business.constants.messages.Messages;
import com.turkcell.crm.customer_service.core.business.abstracts.MessageService;
import com.turkcell.crm.customer_service.core.utilities.exceptions.types.BusinessException;
import com.turkcell.crm.customer_service.data_access.abstracts.AccountTypeRepository;
import com.turkcell.crm.customer_service.entities.concretes.AccountType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountTypeBusinessRules {
    private final MessageService messageService;
    private final AccountTypeRepository accountTypeRepository;

    public void accountTypeShouldBeExist(int accountTypeId) {
        Optional<AccountType> accountType = accountTypeRepository.findById(accountTypeId);
        if (accountType.isEmpty()) {
            throw new BusinessException(messageService.getMessage(Messages.AccountTypeMessages.NOT_FOUND));
        }
    }

    public void accountTypeShouldBeExist(Optional<AccountType> accountType) {
        if (accountType.isEmpty()) {
            throw new BusinessException(messageService.getMessage(Messages.AccountTypeMessages.NOT_FOUND));
        }
    }
}