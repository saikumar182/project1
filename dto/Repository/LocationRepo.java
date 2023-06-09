package com.example.dto.Repository;

import com.example.dto.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Location,Long> {
}
