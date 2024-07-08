package com.resources.poc;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class ResourceService {
	 private final ResourceLoader resourceLoader;

	    public ResourceService(ResourceLoader resourceLoader) {
	        this.resourceLoader = resourceLoader;
	    }

	    public String readFromClasspath(String path) throws IOException {
	        Resource resource = resourceLoader.getResource("classpath:" + path);
	        return new String(resource.getInputStream().readAllBytes());
	    }

//	    public String readFromFileSystem(String path) throws IOException {
//	        Resource resource = resourceLoader.getResource("file:" + path);
//	        return new String(resource.getInputStream().readAllBytes());
//	    }

}
