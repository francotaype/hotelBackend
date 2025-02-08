package com.francode.hotelBacked.presentation.controller;

import com.francode.hotelBacked.business.services.interfaces.RoomService;
import com.francode.hotelBacked.presentation.dto.request.RoomRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.RoomResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/room")
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public ResponseEntity<RoomResponseDTO> create(@RequestBody RoomRequestDTO roomRequestDTO) {
        RoomResponseDTO roomResponseDTO = roomService.create(roomRequestDTO);
        return ResponseEntity.status(201).body(roomResponseDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoomResponseDTO> findById(@PathVariable Long id) {
        Optional<RoomResponseDTO> roomResponseDTO = roomService.findById(id);
        return roomResponseDTO.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoomResponseDTO> update(@PathVariable Long id, @RequestBody RoomRequestDTO roomRequestDTO) {
        RoomResponseDTO roomResponseDTO = roomService.update(id, roomRequestDTO);
        return roomResponseDTO != null ? ResponseEntity.ok(roomResponseDTO) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        roomService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Page<RoomResponseDTO>> findAll(
            @RequestParam(required = false) String field,
            @RequestParam(required = false) String value,
            Pageable pageable) {

        Page<RoomResponseDTO> roomResponseDTOs = roomService.findAll(field, value, pageable);
        return ResponseEntity.ok(roomResponseDTOs);
    }
}