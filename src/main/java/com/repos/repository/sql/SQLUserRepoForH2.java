//package com.repos.repository.sql;
//
//import org.springframework.context.annotation.Profile;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.repos.domain.sql.SQLUser;
//import com.repos.repository.UserRepository;
//
//import io.github.jhipster.config.JHipsterConstants;
//
//@Repository
//@Profile(JHipsterConstants.SPRING_PROFILE_PRODUCTION)
//public interface SQLUserRepoForH2 extends JpaRepository<SQLUser, Long>,UserRepository {
//	@Query("select u from User u where u.id = :i")
//    SQLUser toFindUserByHisIdentifier(@Param("i") Long i);
//}
