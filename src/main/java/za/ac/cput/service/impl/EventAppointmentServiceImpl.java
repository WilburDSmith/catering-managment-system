package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.EventAppointment;
import za.ac.cput.repository.EventAppointmentRepository;
import za.ac.cput.service.EventAppointmentService;

import java.util.List;
import java.util.Optional;

@Service
public class EventAppointmentServiceImpl implements EventAppointmentService {

    private final EventAppointmentRepository eventAppointmentRepository;

    @Autowired
    public EventAppointmentServiceImpl(EventAppointmentRepository eventAppointmentRepository) {
        this.eventAppointmentRepository = eventAppointmentRepository;
    }

    @Override
    public EventAppointment save(EventAppointment eventAppointment) {
        return this.eventAppointmentRepository.save(eventAppointment);
    }


    @Override
    public Optional<EventAppointment> read(String s) {
        return this.eventAppointmentRepository.findById(s);
    }

    @Override
    public boolean delete(EventAppointment eventAppointment) {
        this.eventAppointmentRepository.delete(eventAppointment);
        return false;
    }

    @Override
    public boolean deletebyid(String id) {
        this.eventAppointmentRepository.deleteById(id);
        return false;
    }

    @Override
    public List<EventAppointment> findAll () {
        return null;
    }

}