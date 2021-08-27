package my.project.bamboo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import my.project.bamboo.entity.Account;
import my.project.bamboo.repository.AccountRepository;

@Service
public class AccountService{
    @Autowired
    private AccountRepository accountRepository;
    protected final static Logger logger = LoggerFactory.getLogger(AccountService.class);


    public List<Account> findAll(){
        return accountRepository.findAll();
    }
    public Account findOne(Long id) {
        return accountRepository.getOne(id);
    }
    public Account save(Account account){
        return accountRepository.save(account);
    }
    public void delete(Long id){
        accountRepository.deleteById(id);
    }
}