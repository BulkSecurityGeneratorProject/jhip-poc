//package com.repos.domain.sql;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import com.repos.domain.PersistentAuditEventI;
//
//import java.io.Serializable;
//import java.time.Instant;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Persist AuditEvent managed by the Spring Boot actuator.
// *
// * @see org.springframework.boot.actuate.audit.AuditEvent
// */
//@Entity
//@Table(name = "jhi_persistent_audit_event")
////@Document(collection = "jhi_persistent_audit_event")
//public class SQLPersistentAuditEvent implements Serializable,PersistentAuditEventI {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "event_id")
//    private Long id;
//
//    @NotNull
//    @Column(nullable = false)
//    private String principal;
//
//    @Column(name = "event_date")
//    private Instant auditEventDate;
//
//    @Column(name = "event_type")
//    private String auditEventType;
//
//    @ElementCollection
//    @MapKeyColumn(name = "name")
//    @Column(name = "value")
//    @CollectionTable(name = "jhi_persistent_audit_evt_data", joinColumns=@JoinColumn(name="event_id"))
//    private Map<String, String> data = new HashMap<>();
//
////    public Long getId() {
////        return id;
////    }
//    
//    public String getId() {
//        return id.toString();
//    }
//
//    public void setId(String id) {
//    	this.id = Long.parseLong(id) ;
//    }
//
//    public String getPrincipal() {
//        return principal;
//    }
//
//    public void setPrincipal(String principal) {
//        this.principal = principal;
//    }
//
//    public Instant getAuditEventDate() {
//        return auditEventDate;
//    }
//
//    public void setAuditEventDate(Instant auditEventDate) {
//        this.auditEventDate = auditEventDate;
//    }
//
//    public String getAuditEventType() {
//        return auditEventType;
//    }
//
//    public void setAuditEventType(String auditEventType) {
//        this.auditEventType = auditEventType;
//    }
//
//    public Map<String, String> getData() {
//        return data;
//    }
//
//    public void setData(Map<String, String> data) {
//        this.data = data;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (!(o instanceof SQLPersistentAuditEvent)) {
//            return false;
//        }
//        return id != null && id.equals(((SQLPersistentAuditEvent) o).id);
//    }
//
//    @Override
//    public int hashCode() {
//        return 31;
//    }
//
//    @Override
//    public String toString() {
//        return "PersistentAuditEvent{" +
//            "principal='" + principal + '\'' +
//            ", auditEventDate=" + auditEventDate +
//            ", auditEventType='" + auditEventType + '\'' +
//            '}';
//    }
//}
