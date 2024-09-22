package com.photo.PhotoLoader.web;

import com.photo.PhotoLoader.model.Photo;
import com.photo.PhotoLoader.service.PhotoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@RestController
@AllArgsConstructor
public class PhotoController {

    private final PhotoService photoService;

    @GetMapping("/photos")
    public Iterable<Photo> getPhotos() {
        return  photoService.getAll();
    }

    @GetMapping("/photos/{id}")
    public Photo getPhotoById(@PathVariable Integer id) {
        Photo photo = photoService.getById(id);
        if (photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return photo;
    }

    @DeleteMapping("/photos/{id}")
    public void deletePhotoById(@PathVariable Integer id) {
         photoService.remove(id);
    }

    @PostMapping("/photos/")
    public Photo addPhoto(@RequestPart("data") MultipartFile file) throws IOException {
        return photoService.save(file.getOriginalFilename(), file.getContentType(), file.getBytes());
    }
}
