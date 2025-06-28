package org.example.redistask.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


@RedisHash("Aircraft")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Aircraft {
    @Id
    private String id;
    private String brand;
    private String model;
    private String manufacturer;
}
