public class ResoruceController {
    package com.example.communityresources.controller;

    import com.example.communityresources.model.Resource;
    import com.example.communityresources.service.ResourceService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;
    
    import java.util.List;
    
    @RestController
    @RequestMapping("/api/resources")
    public class ResourceController {
    
        @Autowired
        private ResourceService resourceService;
    
        @GetMapping
        public List<Resource> getAllResources() {
            return resourceService.findAll();
        }
    
        @PostMapping
        public Resource createResource(@RequestBody Resource resource) {
            return resourceService.save(resource);
        }
    
        @DeleteMapping("/{id}")
        public void deleteResource(@PathVariable String id) {
            resourceService.deleteById(id);
        }
    }
      
}
