package com.civa.reto.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BusDto {
    private Long id;
    private Long number;
    private String plate;
    private String createdAt;
    private String characteristics;
    private Boolean isActive;
    private String brandName;


}
