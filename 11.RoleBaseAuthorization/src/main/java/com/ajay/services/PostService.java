package com.ajay.services;



import java.util.List;
import java.util.Map;

import com.ajay.dto.PostDTO;

public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

    PostDTO getPostById(Long postId);

	PostDTO update(PostDTO inputPost);

	void delete(long postId);

	PostDTO partialUpdate(long id, Map<String, Object> dto);
}
