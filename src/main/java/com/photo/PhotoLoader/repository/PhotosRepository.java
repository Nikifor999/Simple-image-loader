package com.photo.PhotoLoader.repository;

import com.photo.PhotoLoader.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {
}
