package com.group18.springboot.repositories;

import com.group18.springboot.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Additional methods specific to ticket data retrieval (optional)
}