package de.frickeldave.fleckerlteppich.telemetry.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="system")
public class System {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hostname;
    private String fqdn;
    private String primaryIPv4Address;
    private String mac;
    private String serial;
    private LocalDateTime timestamp;
    private LocalDateTime lastboot;

    public System() {
        
    }

    public System(final String hostname, final String fqdn, final String primaryIPv4Address, final String mac,
            final String serial, final LocalDateTime timestamp, final LocalDateTime lastboot) {
        this.hostname = hostname;
        this.fqdn = fqdn;
        this.primaryIPv4Address = primaryIPv4Address;
        this.mac = mac;
        this.serial = serial;
        this.timestamp = timestamp;
        this.lastboot = lastboot;
    }

    @Column(name = "id", nullable = false)
    public Long getId() { return id; }

    @Column(name = "hostname", nullable = false)
    public String getHostname() { return hostname; }

    public void setHostname(final String hostname) { this.hostname = hostname; }

    @Column(name = "lastboot")
    public LocalDateTime getLastboot() { return lastboot;}

    public void setLastboot(final LocalDateTime lastboot) { this.lastboot = lastboot; }

    @Column(name = "timestamp", nullable = false)
    public LocalDateTime getTimestamp() { return timestamp; }

    public void setTimestamp(final LocalDateTime timestamp) { this.timestamp = timestamp; }

    @Column(name = "serial")
    public String getSerial() { return serial; }

    public void setSerial(final String serial) { this.serial = serial; }

    @Column(name = "mac")
    public String getMac() { return mac; }

    public void setMac(final String mac) { this.mac = mac; }

    @Column(name = "primaryipv4address")
    public String getPrimaryIPv4Address() { return primaryIPv4Address; }

    public void setPrimaryIPv4Address(final String primaryIPv4Address) { this.primaryIPv4Address = primaryIPv4Address; }

    @Column(name = "fqdn")
    public String getFqdn() { return fqdn; }

    public void setFqdn(final String fqdn) { this.fqdn = fqdn; }
}
