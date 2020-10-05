package de.frickeldave.fleckerlteppich.telemetry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import de.frickeldave.fleckerlteppich.telemetry.entity.System;
import de.frickeldave.fleckerlteppich.telemetry.repository.SystemRepository;

@RestController
@RequestMapping("systems")
public class SystemController {

    @Autowired
    private SystemRepository systemRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<System> getDevices() {
        final List<System> deviceList = systemRepository.findAll();
        return deviceList;
    }

    @RequestMapping(
        method = RequestMethod.POST,
        path = "/add",
        produces = MediaType.APPLICATION_JSON_VALUE, 
        consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public System postSystem(@RequestBody System system) {
        return systemRepository.save(system);
    }
}