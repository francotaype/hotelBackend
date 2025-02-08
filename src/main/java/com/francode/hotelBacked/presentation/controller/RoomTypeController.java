package com.francode.hotelBacked.presentation.controller;

import com.francode.hotelBacked.business.services.interfaces.RoomTypeService;
import com.francode.hotelBacked.presentation.dto.request.RoomTypeRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.RoomTypeResponseDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/roomType")
public class RoomTypeController {

    private final RoomTypeService roomTypeService;

    @Autowired
    public RoomTypeController(RoomTypeService roomTypeService) {
        this.roomTypeService = roomTypeService;
    }

    @PostMapping
    public ResponseEntity<RoomTypeResponseDTO> create(@Valid @RequestBody RoomTypeRequestDTO roomTypeRequestDTO) {
        RoomTypeResponseDTO roomTypeResponseDTO = roomTypeService.create(roomTypeRequestDTO);
        return ResponseEntity.status(201).body(roomTypeResponseDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoomTypeResponseDTO> findById(@PathVariable Long id) {
        Optional<RoomTypeResponseDTO> roomTypeResponseDTO = roomTypeService.findById(id);
        return roomTypeResponseDTO.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoomTypeResponseDTO> update(@PathVariable Long id, @Valid @RequestBody RoomTypeRequestDTO roomTypeRequestDTO) {
        RoomTypeResponseDTO roomTypeResponseDTO = roomTypeService.update(id, roomTypeRequestDTO);
        return roomTypeResponseDTO != null ? ResponseEntity.ok(roomTypeResponseDTO) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        roomTypeService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Page<RoomTypeResponseDTO>> findAll(
            @RequestParam(required = false) String field,
            @RequestParam(required = false) String value,
            Pageable pageable) {

        Page<RoomTypeResponseDTO> roomTypeResponseDTOs = roomTypeService.findAll(field, value, pageable);
        return ResponseEntity.ok(roomTypeResponseDTOs);
    }
}