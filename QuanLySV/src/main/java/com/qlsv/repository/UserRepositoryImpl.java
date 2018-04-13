// package com.qlsv.repository;
//
// import java.util.List;
//
// import org.hibernate.SessionFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;
//
// import com.qlsv.entities.User;
//
// @Repository
// @Transactional
// public class UserRepositoryImpl implements UserRepository {
//
// @Autowired
// SessionFactory session;
//
// @Override
// public boolean saveOrUpdate(User users) {
// // TODO Auto-generated method stub
// session.getCurrentSession().saveOrUpdate(users);
// return true;
// }
//
// @Override
// public List<User> list() {
// return session.getCurrentSession().createQuery("from User").list();
// }
//
// @Override
// public boolean delete(User users) {
// try {
// session.getCurrentSession().delete(users);
// } catch (Exception ex) {
// return false;
// }
//
// return true;
// }
//
// }
