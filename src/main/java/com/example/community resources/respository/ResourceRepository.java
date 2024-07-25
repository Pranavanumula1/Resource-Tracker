public class ResourceRepository{
    package com.example.communityresources.repository;

    import com.example.communityresources.model.Resource;
    import org.springframework.data.mongodb.repository.MongoRepository;

    public interface ResourceRepository extends MongoRepository<Resource, String> {
    }
}
