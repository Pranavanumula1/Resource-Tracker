public class ResourceService {
    package com.example.communityresources.service;

import com.example.communityresources.model.Resource;
import com.example.communityresources.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;

    public Resource save(Resource resource) {
        return resourceRepository.save(resource);
    }

    public List<Resource> findAll() {
        return resourceRepository.findAll();
    }

    public void deleteById(String id) {
        resourceRepository.deleteById(id);
    }
}

}
