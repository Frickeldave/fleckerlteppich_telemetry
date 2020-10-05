package de.frickeldave.fleckerlteppich.telemetry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import de.frickeldave.fleckerlteppich.telemetry.entity.System;

public interface SystemRepository  extends JpaRepository<System, Long> {
    
}