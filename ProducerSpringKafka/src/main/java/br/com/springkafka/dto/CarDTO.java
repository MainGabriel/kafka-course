package br.com.springkafka.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CarDTO {

    private String id;
    private String name;
    private String brand;

}
