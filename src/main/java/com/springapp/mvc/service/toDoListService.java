package com.springapp.mvc.service;

public class toDoListService {

}


// need sql session with mybatis

// need to have DB setup,
//insertions, update


//
//    private void create(Account account, String role) throws ServiceException {
//        try {
//            accountMapper.insert(account);
//            account = accountMapper.findAccountByEmail(account.getEmailAddress());
//            accountRoleMapper.insert(roleFor(account, role));
//            sqlSession.commit();
//        } catch (Exception e) {
//            sqlSession.rollback();
//            throw new ServiceException();
//        }
//    }