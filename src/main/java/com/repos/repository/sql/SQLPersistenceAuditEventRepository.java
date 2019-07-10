package com.repos.repository.sql;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.repos.domain.PersistentAuditEvent;
//import com.repos.domain.sql.SQLPersistentAuditEvent;
import com.repos.repository.PersistenceAuditEventRepository;

import java.time.Instant;
import java.util.List;

/**
 * Spring Data JPA repository for the {@link SQLPersistentAuditEvent} entity.
 */
public interface SQLPersistenceAuditEventRepository extends JpaRepository<PersistentAuditEvent, String>,PersistenceAuditEventRepository {

    List<PersistentAuditEvent> findByPrincipal(String principal);

    List<PersistentAuditEvent> findByAuditEventDateAfter(Instant after);

    List<PersistentAuditEvent> findByPrincipalAndAuditEventDateAfter(String principal, Instant after);

    List<PersistentAuditEvent> findByPrincipalAndAuditEventDateAfterAndAuditEventType(String principal, Instant after, String type);

    Page<PersistentAuditEvent> findAllByAuditEventDateBetween(Instant fromDate, Instant toDate, Pageable pageable);
}
