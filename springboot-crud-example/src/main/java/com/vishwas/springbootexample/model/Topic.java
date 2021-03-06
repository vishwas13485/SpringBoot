package com.vishwas.springbootexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Topic {
    @Id
    private String id;
    @Size(min = 2, message = "name can't be less than 2 characters")
    @NotNull
    private String name;
    @NotBlank
    private String description;


    @OneToMany(mappedBy = "topic")
    private List<Post> postList;


    public Topic() {
    }

    public Topic(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.description = desc;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return description;
	}


    public void setDesc(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

}
