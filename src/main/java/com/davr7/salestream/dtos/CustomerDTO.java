package com.davr7.salestream.dtos;

import java.time.LocalDateTime;

import com.davr7.salestream.entities.Customer;

public record CustomerDTO(String id, String fullname, String username, String email, String phone, LocalDateTime createdAt, LocalDateTime  updatedAt) {
}
