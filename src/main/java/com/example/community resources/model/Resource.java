public class Resource {
package com.example.communityresources.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "resources")
public class Resource {
    @Id
    private String id;
    private String name;
    private String category;
    private String address;
    private String contact;
    private String description;
    private double latitude;
    private double longitude;
    }
}
