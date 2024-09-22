package com.photo.PhotoLoader.service;


import com.photo.PhotoLoader.model.Photo;
import com.photo.PhotoLoader.repository.PhotosRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PhotoService {


    private final PhotosRepository photosRepository;

    public PhotoService(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    public Iterable<Photo> getAll() {
        return photosRepository.findAll();
    }

    public Photo getById(Integer id) {
        return photosRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
         photosRepository.deleteById(id);
    }

    public Photo save(String filename, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(filename);
        photo.setData(data);
        photosRepository.save(photo);
        return photo;
    }
}
