package com.se1020.carservice.repository;

import com.se1020.carservice.model.Appointment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import tools.jackson.databind.json.JsonMapper;

@Repository
public class AppointmentRepository extends JsonFileRepository<Appointment> {
    public AppointmentRepository(JsonMapper objectMapper, @Value("${app.storage.dir:data}") String storageDir) {
        super(objectMapper, storageDir, "appointments.json", Appointment.class, Appointment::getId);
    }
}
