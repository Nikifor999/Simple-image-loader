package com.photo.PhotoLoader.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("PHOTOS")
public class Photo {

    @Id
    private Integer id;
    @NotEmpty
    private String fileName;
    @JsonIgnore
    private byte[] data;

    private String contentType;


}
